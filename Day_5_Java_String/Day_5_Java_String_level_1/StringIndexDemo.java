import java.util.*;
public class StringIndexDemo {
    public static void generate() {
        String s = "hello";
        System.out.println(s.charAt(10));
    }
    public static void handle() {
        try {
            String s = "hello";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // generate();
        handle();
    }
}
