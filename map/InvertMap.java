import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1); map.put("B", 2); map.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (String k : map.keySet()) {
            int v = map.get(k);
            inverted.putIfAbsent(v, new ArrayList<>());
            inverted.get(v).add(k);
        }
        System.out.println(inverted);
    }
}
