import java.util.Random;
class NegativeAmountException extends Exception { NegativeAmountException(String m){super(m);} }
class InsufficientFundsException2 extends Exception { InsufficientFundsException2(String m){super(m);} }
class NetworkFailureException extends Exception { NetworkFailureException(String m){super(m);} }
class Transaction {
    void process() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        int n = new Random().nextInt(3);
        if (n == 0) throw new NegativeAmountException("Negative amount not allowed");
        if (n == 1) throw new InsufficientFundsException2("Insufficient balance");
        throw new NetworkFailureException("Network failure");
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try { t.process(); }
        catch (NegativeAmountException e) { System.out.println(e.getMessage()); }
        catch (InsufficientFundsException2 e) { System.out.println(e.getMessage()); }
        catch (NetworkFailureException e) { System.out.println(e.getMessage()); }
    }
}
