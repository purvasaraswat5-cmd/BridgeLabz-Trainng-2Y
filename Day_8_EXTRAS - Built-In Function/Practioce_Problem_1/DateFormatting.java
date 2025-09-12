import java.time.*;
import java.time.format.*;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(d.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}
