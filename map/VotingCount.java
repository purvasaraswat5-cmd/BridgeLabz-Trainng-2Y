import java.util.*;
public class VotingCount {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        String[] poll = {"A","B","C","A","B","A","C","A","B","A"};

        for (String c : poll)
            votes.put(c, votes.getOrDefault(c,0)+1);

        String winner = null;
        int max = -1;

        for (String k : votes.keySet())
            if (votes.get(k) > max){ max = votes.get(k); winner = k; }

        System.out.println(votes);
        System.out.println("Winner: "+winner);
    }
}
