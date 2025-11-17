import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");
        map.put("UK","London");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("China","Beijing");
        map.put("Germany","Berlin");
        map.put("Italy","Rome");

        String c = "Japan";
        System.out.println(map.getOrDefault(c,"Unknown country"));

        for (String k : map.keySet())
            System.out.println(k+" = "+map.get(k));
    }
}
