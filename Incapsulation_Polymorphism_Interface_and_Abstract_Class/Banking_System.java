import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    String calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int number, String name, double balance) { super(number, name, balance); }
    @Override
    public double calculateInterest() { return getBalance() * 0.04; }
    @Override
    public boolean applyForLoan(double amount) { return getBalance() > 5000; }
    @Override
    public String calculateLoanEligibility() { return "Savings Account Loan Eligibility"; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int number, String name, double balance) { super(number, name, balance); }
    @Override
    public double calculateInterest() { return getBalance() * 0.02; }
    @Override
    public boolean applyForLoan(double amount) { return getBalance() > 20000; }
    @Override
    public String calculateLoanEligibility() { return "Current Account Loan Eligibility"; }
}

public class BankingApp {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Alice", 10000));
        accounts.add(new CurrentAccount(102, "Bob", 50000));
        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: " + acc.calculateInterest());
        }
    }
}
