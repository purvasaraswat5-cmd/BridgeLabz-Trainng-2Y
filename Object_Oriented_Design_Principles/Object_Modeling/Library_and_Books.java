import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
