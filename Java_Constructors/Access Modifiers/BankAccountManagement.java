class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavings() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SB12345", "Rohit Sharma", 50000, 4.5);
        sa.displaySavings();
        sa.deposit(10000);
        sa.withdraw(20000);
        sa.displaySavings();
    }
}
