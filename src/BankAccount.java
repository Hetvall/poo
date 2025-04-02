public class BankAccount {
    int accountNumber;
    int balance;
    String accountOwner;

    public BankAccount(int accountNumber, int balance, String accountOwner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void deposit() {
        System.out.println(accountOwner + " is depositing into his account " + accountNumber);
    }

    public void withdraw() {
        System.out.println(accountOwner + " is withdrawing a total of " + balance);
    }
}
