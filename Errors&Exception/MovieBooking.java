import java.util.*;
class InvalidSeatException extends Exception { InvalidSeatException(String m){super(m);} }
class SeatAlreadyBookedException extends Exception { SeatAlreadyBookedException(String m){super(m);} }
class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();
    MovieBooking() { for(int i=1;i<=5;i++) seats.put(i, true); }
    void bookSeat(int n) throws Exception {
        if (!seats.containsKey(n)) throw new InvalidSeatException("Invalid seat number");
        if (!seats.get(n)) throw new SeatAlreadyBookedException("Seat already booked");
        seats.put(n, false);
        System.out.println("Seat booked successfully");
    }
    public static void main(String[] args) {
        MovieBooking m = new MovieBooking();
        try { m.bookSeat(1); m.bookSeat(1); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
