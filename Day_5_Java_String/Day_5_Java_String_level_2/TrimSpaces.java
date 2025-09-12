import java.util.*;
public class TrimSpaces {
    public static int[] trimBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    public static String substringManual(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++) r += s.charAt(i);
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
        int[] b = trimBounds(s);
        String m = substringManual(s, b[0], b[1]);
        String btrim = s.trim();
        System.out.println(compare(m, btrim));
    }
}
