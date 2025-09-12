import java.util.*;
public class VotingEligibility {
    public static int[] randomAges(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = (int)(Math.random() * 90) + 10;
        return arr;
    }
    public static String[][] canVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return res;
    }
    public static void display(String[][] arr) {
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }
    public static void main(String[] args) {
        int[] ages = randomAges(10);
        display(canVote(ages));
    }
}
