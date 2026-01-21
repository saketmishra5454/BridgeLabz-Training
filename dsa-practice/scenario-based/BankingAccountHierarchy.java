// Abstract class because: we don't want to create a direct BankAccount object
abstract class BankAccount {

    // no modification allowed 
    private final String accountNumber;
    private final double balance;

    // Constructor initializes immutable fields
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;  // set data once
        this.balance = balance;              // cannot change later
    }

    // Getter because fields are private
    public double getBalance() {
        return balance;
    }

    // Polymorphic method implemented differently in subclasses
    public abstract double calculateFee();
}

// SavingsAccount charges 0.5% of balance
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // performance: using primitive double only
        return getBalance() * 0.005; // 0.5% = 0.005 multiplier
    }
}

// CheckingAccount charges:
// if balance < 1000 => flat 1.0 fee
// else => 0
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // using simple condition for performance
        return (getBalance() < 1000.0) ? 1.0 : 0.0;
    }
}
public class BankingAccountHierarchy {
    public static void main(String[] args) {

        // Sample provided input
        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee()); // Output: 5.00

        // Test cases:
        BankAccount s1 = new SavingsAccount("111", 500.0);
        System.out.printf("%.2f%n", s1.calculateFee()); // Expected: 2.50

        BankAccount c1 = new CheckingAccount("222", 1500.0);
        System.out.printf("%.2f%n", c1.calculateFee()); // Expected: 0.00

        BankAccount c2 = new CheckingAccount("333", 500.0);
        System.out.printf("%.2f%n", c2.calculateFee()); // Expected: 1.00
    }
}
