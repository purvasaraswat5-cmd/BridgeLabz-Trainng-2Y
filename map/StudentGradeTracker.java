import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("Amit",85.0);
        map.put("Riya",92.0);
        map.put("John",76.0);

        map.put("Amit",90.0);

        map.remove("John");

        for (String k : map.keySet())
            System.out.println(k+" = "+map.get(k));
    }
}
