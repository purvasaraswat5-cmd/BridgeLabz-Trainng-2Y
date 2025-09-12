import java.util.*;
public class RPSGame {
    public static String compChoice() {
        int n = (int)(Math.random() * 3);
        return n == 0 ? "rock" : n == 1 ? "paper" : "scissors";
    }
    public static String winner(String u, String c) {
        if (u.equals(c)) return "draw";
        if (u.equals("rock") && c.equals("scissors") || u.equals("scissors") && c.equals("paper") || u.equals("paper") && c.equals("rock")) return "user";
        return "comp";
    }
    public static String[][] stats(int ug, int cg, int games) {
        String[][] res = {{"User", String.valueOf(ug), String.valueOf(ug * 100 / games)}, {"Comp", String.valueOf(cg), String.valueOf(cg * 100 / games)}};
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt(), uw = 0, cw = 0;
        for (int i = 0; i < games; i++) {
            String u = sc.next(), c = compChoice();
            String w = winner(u, c);
            if (w.equals("user")) uw++; else if (w.equals("comp")) cw++;
            System.out.println("User: " + u + " Comp: " + c + " Winner: " + w);
        }
        for (String[] row : stats(uw, cw, games)) System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "%");
    }
}
