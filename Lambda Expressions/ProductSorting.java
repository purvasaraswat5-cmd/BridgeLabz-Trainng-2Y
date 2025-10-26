import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    public String toString() {
        return name + " (Price: ₹" + price + ", Rating: " + rating + ", Discount: " + discount + "%)";
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 15000, 4.5, 10),
            new Product("Laptop", 60000, 4.8, 20),
            new Product("Headphones", 2000, 4.1, 15)
        );

        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
        Comparator<Product> byRating = (p1, p2) -> Double.compare(p2.rating, p1.rating);
        Comparator<Product> byDiscount = (p1, p2) -> Double.compare(p2.discount, p1.discount);

        System.out.println("Sorted by Price:");
        products.stream().sorted(byPrice).forEach(System.out::println);

        System.out.println("\nSorted by Rating:");
        products.stream().sorted(byRating).forEach(System.out::println);

        System.out.println("\nSorted by Discount:");
        products.stream().sorted(byDiscount).forEach(System.out::println);
    }
}
