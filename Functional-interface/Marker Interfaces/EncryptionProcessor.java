interface SensitiveData {}

class BankAccount implements SensitiveData {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class EncryptionProcessor {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 25000.75);
        if (account instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data before storage...");
        } else {
            System.out.println("No encryption needed.");
        }
    }
}
