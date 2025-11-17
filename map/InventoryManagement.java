import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Pen",50);
        stock.put("Book",20);
        stock.put("Bag",10);

        stock.put("Pen", stock.get("Pen") - 5);
        if (stock.get("Pen") <= 0) stock.put("Pen", 0);

        stock.put("Book", stock.get("Book") + 30);

        String q = stock.containsKey("Laptop") ? stock.get("Laptop")+"" : "not stocked";
        System.out.println(q);

        for (String k : stock.keySet())
            if (stock.get(k) == 0) System.out.println(k);
    }
}
