package oamk.stream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public record Product(String name, Double price, String category, LocalDateTime bestBefore) implements OutputFormatter {

    @Override
    public String formatProduct(DateTimeFormatter dt) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String formattedDate = bestBefore.format(formatter);

        return String.format(Locale.US, "[%s,%s,%.2f,%s]", name, category, price, formattedDate);

    }

}    

