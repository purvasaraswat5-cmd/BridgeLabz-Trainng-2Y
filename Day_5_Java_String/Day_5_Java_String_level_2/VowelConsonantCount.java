import java.util.*;
public class VowelConsonantCount {
    public static String type(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String t = type(s.charAt(i));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVC(s);
        System.out.println("Vowels: " + res[0] + " Consonants: " + res[1]);
    }
}
