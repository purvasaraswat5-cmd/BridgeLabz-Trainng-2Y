class AccountNotFoundException extends Exception { AccountNotFoundException(String m){super(m);} }
class InsufficientFundsException3 extends Exception { InsufficientFundsException3(String m){super(m);} }
class BankTransaction {
    void verifyAccount() throws AccountNotFoundException { throw new AccountNotFoundException("Account not found"); }
    void processTransaction() throws InsufficientFundsException3 { throw new InsufficientFundsException3("Insufficient funds"); }
    void executeTransaction() throws Exception { verifyAccount(); processTransaction(); }
    public static void main(String[] args) {
        BankTransaction b = new BankTransaction();
        try { b.executeTransaction(); }
        catch (AccountNotFoundException | InsufficientFundsException3 e) { System.out.println(e.getMessage()); }
        finally { System.out.println("Transaction complete."); }
    }
}
