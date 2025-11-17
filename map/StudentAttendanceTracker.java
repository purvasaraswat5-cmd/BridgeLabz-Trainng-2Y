import java.util.*;
public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String,Integer> att = new HashMap<>();
        List<String> students = List.of("A","B","C","D","E");

        for (String s : students) att.put(s,0);

        List<List<String>> days = new ArrayList<>();
        days.add(List.of("A","B"));
        days.add(List.of("A","C"));
        days.add(List.of("D","E"));

        for (List<String> d : days)
            for (String s : d)
                att.put(s, att.get(s)+1);

        for (String k : att.keySet())
            if (att.get(k) < 2)
                System.out.println(k);
    }
}
