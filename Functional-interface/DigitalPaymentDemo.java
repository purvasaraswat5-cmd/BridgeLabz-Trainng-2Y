interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through Wallet balance.");
    }
}

public class DigitalPaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment creditCard = new CreditCard();
        Payment wallet = new Wallet();
        upi.pay(500.0);
        creditCard.pay(1200.0);
        wallet.pay(250.0);
    }
}
