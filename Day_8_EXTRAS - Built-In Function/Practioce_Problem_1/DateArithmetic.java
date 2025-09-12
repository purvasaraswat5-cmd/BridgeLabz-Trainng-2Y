import java.time.*;
import java.util.*;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LocalDate d=LocalDate.parse(sc.nextLine());
        LocalDate r=d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(r);
    }
}
