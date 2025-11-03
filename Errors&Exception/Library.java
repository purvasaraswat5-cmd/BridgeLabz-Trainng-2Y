import java.util.*;
class BookNotAvailableException extends Exception { BookNotAvailableException(String m){super(m);} }
class InvalidReturnException extends Exception { InvalidReturnException(String m){super(m);} }
class UserLimitExceededException extends Exception { UserLimitExceededException(String m){super(m);} }
class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, List<String>> users = new HashMap<>();
    Library() { books.put("Java", true); books.put("Python", false); }
    void borrow(String user, String book) throws Exception {
        if (!books.containsKey(book) || !books.get(book)) throw new BookNotAvailableException("Book not available");
        users.putIfAbsent(user, new ArrayList<>());
        if (users.get(user).size() >= 5) throw new UserLimitExceededException("Limit exceeded");
        users.get(user).add(book); books.put(book, false);
        System.out.println("Book borrowed");
    }
    void returnBook(String user, String book) throws InvalidReturnException {
        if (!users.containsKey(user) || !users.get(user).contains(book)) throw new InvalidReturnException("Invalid return");
        users.get(user).remove(book); books.put(book, true);
        System.out.println("Book returned");
    }
    public static void main(String[] args) {
        Library l = new Library();
        try { l.borrow("Amit", "Python"); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
