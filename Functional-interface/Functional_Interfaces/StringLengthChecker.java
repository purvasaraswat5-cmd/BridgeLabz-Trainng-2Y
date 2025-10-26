import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();
        String message = "This is a sample message.";
        int limit = 20;
        int length = lengthChecker.apply(message);
        if (length > limit) {
            System.out.println("Message exceeds character limit.");
        } else {
            System.out.println("Message within limit.");
        }
    }
}
