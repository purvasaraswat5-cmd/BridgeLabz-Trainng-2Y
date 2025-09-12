import java.util.*;
public class ShortLongWord {
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
    public static String[][] wordsWithLengths(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }
    public static int[] shortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]), max = min, minIdx = 0, maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitManual(s);
        String[][] arr = wordsWithLengths(words);
        int[] res = shortestLongest(arr);
        System.out.println("Shortest: " + arr[res[0]][0]);
        System.out.println("Longest: " + arr[res[1]][0]);
    }
}
