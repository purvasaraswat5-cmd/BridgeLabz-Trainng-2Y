class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S24", 79999.99);
        MobilePhone m2 = new MobilePhone("Apple", "iPhone 15", 129999.50);

        m1.displayDetails();
        System.out.println();
        m2.displayDetails();
    }
}
