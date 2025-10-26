import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Ravi", "Neha", "Amit", "Priya");
        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }
}
