package Assignment02.Question01;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }

    // Get account number method
    public String getAccountNumber() {
        return accountNumber;
    }

    // Set account number method (demonstrating protected access specifier)
    protected void setAccountNumber(String newAccountNumber) {
        accountNumber = newAccountNumber;
    }
}
