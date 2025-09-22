import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName; this.price = price; this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity + " @ " + price);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }
    @Override
    public String getDiscountDetails() { return "10% off on Veg"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 50; }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    @Override
    public String getDiscountDetails() { return "5% off on Non-Veg"; }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer", 200, 2));
        order.add(new NonVegItem("Chicken", 300, 1));
        for (FoodItem f : order) {
            double total = f.calculateTotalPrice();
            double discount = ((Discountable)f).applyDiscount();
            System.out.println("Final Price: " + (total - discount));
        }
    }
}
