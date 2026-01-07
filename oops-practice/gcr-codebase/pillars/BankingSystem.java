// Interface for loan related features
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {

    // encapsulation: private data members
    private int accountNumber;
    private String holderName;
    protected double balance;

    // constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // getters only (no direct access)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    // concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited");
        }
    }

    // concrete method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Not enough balance");
        }
    }

    // abstract method
    public abstract double calculateInterest();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // less interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        // polymorphism
        BankAccount acc1 = new SavingsAccount(201, "Saket Mishra", 8000);
        BankAccount acc2 = new CurrentAccount(202, "Neha", 12000);

        BankAccount[] accounts = { acc1, acc2 };

        for (BankAccount acc : accounts) {

            System.out.println("------------------------");
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account No: " + acc.getAccountNumber());

            acc.deposit(2000);
            acc.withdraw(1500);

            // dynamic method calling
            System.out.println("Interest: " + acc.calculateInterest());

            // interface reference
            Loanable loan = (Loanable) acc;
            loan.applyForLoan(50000);
            System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
        }
    }
}
