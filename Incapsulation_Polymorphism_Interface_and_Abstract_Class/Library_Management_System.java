import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(itemId + " " + title + " by " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    public Book(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 14; }
    @Override
    public void reserveItem() { reserved = true; }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;
    public Magazine(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 7; }
    @Override
    public void reserveItem() { reserved = true; }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;
    public DVD(int id, String title, String author) { super(id, title, author); }
    @Override
    public int getLoanDuration() { return 3; }
    @Override
    public void reserveItem() { reserved = true; }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

public class LibraryApp {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Today", "Editor A"));
        items.add(new DVD(3, "OOP Movie", "Director B"));
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration());
        }
    }
}
