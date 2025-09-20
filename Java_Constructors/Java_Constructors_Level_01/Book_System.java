class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + availability);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 450.50, true);
        b1.display();
        b1.borrowBook();
        b1.display();
        b1.borrowBook();
    }
}
