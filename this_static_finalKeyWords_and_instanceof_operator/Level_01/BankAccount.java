class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccount() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("John", 101);
        BankAccount a2 = new BankAccount("Alice", 102);
        a1.displayAccount();
        a2.displayAccount();
        BankAccount.getTotalAccounts();
    }
}
