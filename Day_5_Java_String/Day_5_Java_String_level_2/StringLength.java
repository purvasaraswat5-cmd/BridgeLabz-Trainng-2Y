import java.util.*;
public class StringLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            for (;; count++) s.charAt(count);
        } catch (Exception e) {}
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getLength(s));
        System.out.println(s.length());
    }
}
