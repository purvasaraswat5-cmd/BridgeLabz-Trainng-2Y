import java.util.*;

class Product {
    String name;
    double quantity;
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    List<Product> products;

    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Product p1 = new Product("Apples", 2, 3);
        Product p2 = new Product("Milk", 1, 2);
        c1.addProduct(p1);
        c1.addProduct(p2);
        BillGenerator billGen = new BillGenerator();
        double totalBill = billGen.generateBill(c1);
        System.out.println("Customer: " + c1.name + ", Total Bill: $" + totalBill);
    }
}
