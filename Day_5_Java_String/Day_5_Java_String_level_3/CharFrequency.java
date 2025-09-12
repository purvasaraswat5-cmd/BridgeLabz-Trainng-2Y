import java.util.*;

public class CharFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = String.valueOf((char) i);
                result[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = findFrequency(text);
        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println("   " + result[i][0] + "          " + result[i][1]);
        }
    }
}
