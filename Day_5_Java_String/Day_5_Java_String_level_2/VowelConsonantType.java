import java.util.*;
public class VowelConsonantType {
    public static String type(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] classify(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = type(s.charAt(i));
        }
        return arr;
    }
    public static void display(String[][] arr) {
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        display(classify(s));
    }
}
