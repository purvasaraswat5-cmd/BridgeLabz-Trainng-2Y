class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class ProductGeneric<T> {
    private String name;
    private double price;
    private T category;
    public ProductGeneric(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice() { return price; }
    public String getName() { return name; }
}

public class DynamicMarketplace {
    public static <T extends ProductGeneric<?>> void applyDiscount(T product, double percentage) {
        double discounted = product.getPrice() - (product.getPrice() * percentage / 100);
        System.out.println(product.getName() + " after discount: " + discounted);
    }

    public static void main(String[] args) {
        ProductGeneric<BookCategory> book = new ProductGeneric<>("Java Book", 500, new BookCategory());
        applyDiscount(book, 10);
    }
}
