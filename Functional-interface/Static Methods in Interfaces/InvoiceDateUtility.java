import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDateUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("DD-MM-YYYY: " + DateFormatter.formatDate(today, "dd-MM-yyyy"));
        System.out.println("YYYY/MM/DD: " + DateFormatter.formatDate(today, "yyyy/MM/dd"));
        System.out.println("Full Format: " + DateFormatter.formatDate(today, "EEEE, MMMM dd, yyyy"));
    }
}
