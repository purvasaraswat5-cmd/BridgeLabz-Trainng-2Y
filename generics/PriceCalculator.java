import java.util.*;

class Product {
    private double price;
    public Product(double price) { this.price = price; }
    public double getPrice() { return price; }
}

class Mobile extends Product { public Mobile(double p) { super(p); } }
class Laptop extends Product { public Laptop(double p) { super(p); } }

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Mobile(1000), new Laptop(2000));
        System.out.println(calculateTotal(products));
    }
}
