import java.util.*;

class Customer {
    String name;
    List<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            System.out.println("Account No: " + a.accountNumber + ", Balance: " + a.balance);
        }
    }
}

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class Bank {
    String bankName;
    List<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer customer, int accountNumber, double initialDeposit) {
        Account acc = new Account(accountNumber, initialDeposit);
        customer.addAccount(acc);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened in " + bankName + " for " + customer.name);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 2000);
        bank.openAccount(c2, 201, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
