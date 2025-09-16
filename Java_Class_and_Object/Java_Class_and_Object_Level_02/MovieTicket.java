class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");
        ticket1.bookTicket("A12", 250.0);
        ticket1.displayDetails();

        System.out.println();

        MovieTicket ticket2 = new MovieTicket("Interstellar");
        ticket2.bookTicket("B7", 300.0);
        ticket2.displayDetails();
    }
}
