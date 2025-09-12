import java.util.*;
public class MarksGrade {
    public static int[][] generateScores(int n) {
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) for (int j = 0; j < 3; j++) arr[i][j] = (int)(Math.random() * 50) + 50;
        return arr;
    }
    public static double[][] calculate(int[][] arr) {
        double[][] res = new double[arr.length][3];
        for (int i = 0; i < arr.length; i++) {
            int total = arr[i][0] + arr[i][1] + arr[i][2];
            double avg = total / 3.0;
            double perc = Math.round((total / 300.0) * 10000.0) / 100.0;
            res[i][0] = total; res[i][1] = avg; res[i][2] = perc;
        }
        return res;
    }
    public static String[] grade(double[][] arr) {
        String[] g = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double p = arr[i][2];
            if (p >= 90) g[i] = "A";
            else if (p >= 75) g[i] = "B";
            else if (p >= 60) g[i] = "C";
            else if (p >= 50) g[i] = "D";
            else g[i] = "F";
        }
        return g;
    }
    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] res = calculate(scores);
        String[] g = grade(res);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + res[i][0] + "\t" + res[i][1] + "\t" + res[i][2] + "\t" + g[i]);
        }
    }
}
