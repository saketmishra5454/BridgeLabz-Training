class BankAccount {            // BankAccount class
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method with overdraft protection
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds. Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 1000.0);

        account.checkBalance();      // Initial balance
        account.deposit(500.0);      // Deposit money
        account.withdraw(200.0);     // Withdraw money
        account.checkBalance();      // Check balance
        account.withdraw(2000.0);    // Attempt overdraft
        account.checkBalance();      // Final balance
    }
}