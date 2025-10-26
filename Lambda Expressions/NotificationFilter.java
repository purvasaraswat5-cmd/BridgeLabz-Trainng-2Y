import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Info", "Medication time."),
            new Alert("Warning", "Low oxygen level detected."),
            new Alert("Info", "Routine checkup reminder.")
        );

        Predicate<Alert> showOnlyCritical = a -> a.type.equals("Critical");
        Predicate<Alert> showOnlyInfo = a -> a.type.equals("Info");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(showOnlyCritical).forEach(System.out::println);

        System.out.println("\nInfo Alerts:");
        alerts.stream().filter(showOnlyInfo).forEach(System.out::println);
    }
}
