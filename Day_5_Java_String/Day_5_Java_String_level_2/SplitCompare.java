import java.util.*;
public class SplitCompare {
    public static int getLength(String s) {
        int c = 0;
        try { for (;; c++) s.charAt(c); } catch (Exception e) {}
        return c;
    }
    public static String[] splitManual(String s) {
        int len = getLength(s), spaces = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaces++;
        String[] res = new String[spaces];
        int idx = 0, start = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                res[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        res[idx] = s.substring(start, len);
        return res;
    }
    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] m = splitManual(s);
        String[] b = s.split(" ");
        System.out.println(compare(m, b));
    }
}
