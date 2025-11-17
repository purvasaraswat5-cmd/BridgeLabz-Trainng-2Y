import java.util.*;
public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String,Integer> math = new HashMap<>();
        math.put("A",85); math.put("B",92); math.put("C",78);

        Map<String,Integer> sci = new HashMap<>();
        sci.put("A",88); sci.put("B",95); sci.put("C",91);

        data.put("Math", math);
        data.put("Science", sci);

        for (String sub : data.keySet()) {
            Map<String,Integer> m = data.get(sub);
            String top = null;
            int max = -1;

            for (String s : m.keySet())
                if (m.get(s) > max){ max = m.get(s); top = s; }

            System.out.println(sub + " topper = " + top);
        }

        for (String sub : data.keySet()) {
            Map<String,Integer> m = data.get(sub);
            double sum = 0;
            for (int v : m.values()) sum += v;
            System.out.println(sub + " avg = " + sum / m.size());
        }

        for (String sub : data.keySet()) {
            Map<String,Integer> m = data.get(sub);
            for (int v : m.values())
                if (v > 90){ System.out.println(sub); break; }
        }
    }
}
