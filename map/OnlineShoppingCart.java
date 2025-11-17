import java.util.*;
public class OnlineShoppingCart {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        for (String k : cart.keySet())
            System.out.println(k + " = " + cart.get(k));

        double total = 0;
        for (double p : cart.values()) total += p;

        if (total > 5000) total = total * 0.90;

        System.out.println("Total = " + total);

        cart.remove("Mouse");
    }
}
