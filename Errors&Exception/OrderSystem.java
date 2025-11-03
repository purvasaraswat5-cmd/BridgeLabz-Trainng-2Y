import java.util.Random;
class OutOfStockException extends Exception { OutOfStockException(String m){super(m);} }
class PaymentFailedException extends Exception { PaymentFailedException(String m){super(m);} }
class OrderSystem {
    void placeOrder() throws OutOfStockException, PaymentFailedException {
        int n = new Random().nextInt(2);
        if (n == 0) throw new OutOfStockException("Product out of stock");
        else throw new PaymentFailedException("Payment failed");
    }
    public static void main(String[] args) {
        OrderSystem o = new OrderSystem();
        try { o.placeOrder(); }
        catch (OutOfStockException | PaymentFailedException e) { System.out.println(e.getMessage()); }
    }
}
