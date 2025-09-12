import java.util.*;
public class UpperCaseDemo {
    public static String toUpperManual(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            r += ch;
        }
        return r;
    }
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = toUpperManual(s);
        String b = s.toUpperCase();
        System.out.println(m);
        System.out.println(b);
        System.out.println(compare(m, b));
    }
}
