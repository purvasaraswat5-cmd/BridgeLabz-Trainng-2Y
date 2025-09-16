import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 55000.0, 1);
        cart.addItem("Mouse", 800.0, 2);
        cart.displayTotalCost();

        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
