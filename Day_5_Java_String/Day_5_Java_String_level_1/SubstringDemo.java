import java.util.*;
public class SubstringDemo {
    public static String substringManual(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end && i < s.length(); i++) res += s.charAt(i);
        return res;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String m = substringManual(s, start, end);
        String b = s.substring(start, end);
        System.out.println(m);
        System.out.println(b);
        System.out.println(compareStrings(m, b));
    }
}
