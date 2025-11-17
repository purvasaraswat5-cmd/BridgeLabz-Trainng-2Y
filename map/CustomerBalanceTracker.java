import java.util.*;
public class CustomerBalanceTracker {
    public static void main(String[] args) {
        Map<String, Double> bank = new HashMap<>();

        bank.put("AC01", 5000.0);
        bank.put("AC02", 8000.0);
        bank.put("AC03", 3000.0);
        bank.put("AC04", 15000.0);
        bank.put("AC05", 9000.0);

        bank.put("AC01", bank.get("AC01") + 2000);
        if (bank.get("AC03") >= 4000)
            bank.put("AC03", bank.get("AC03") - 4000);

        List<Map.Entry<String,Double>> list = new ArrayList<>(bank.entrySet());
        list.sort((a,b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String,Double> e : list)
            System.out.println(e.getKey()+" = "+e.getValue());

        for (int i = 0; i < 3; i++)
            System.out.println(list.get(i).getKey());
    }
}
