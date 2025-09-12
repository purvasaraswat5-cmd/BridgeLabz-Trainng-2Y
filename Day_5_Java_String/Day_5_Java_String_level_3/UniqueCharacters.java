import java.util.*;

public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueChars(String text) {
        int n = findLength(text);
        char[] temp = new char[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = c;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] result = uniqueChars(text);
        for (char c : result) System.out.print(c + " ");
    }
}
