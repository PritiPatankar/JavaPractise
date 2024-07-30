package Assignment02.Question01;

// BankAccountSystem.java (Main class)
public class BankAccountSystem {
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("123456", 1000.0);

        // Deposit and withdraw
        account.deposit(500.0);
        account.withdraw(200.0);

        // Print account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}
