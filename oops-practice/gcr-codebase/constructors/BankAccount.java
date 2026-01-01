//Banking System
public class BankAccount {

    public int accountNumber;           // public member
    protected String accountHolder;         // protected member
    private double balance;          // private member

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {            // method to display account details
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {          // main method

        BankAccount acc = new BankAccount(101, "Amit", 5000);
        System.out.println("---- Bank Account Details ----");
        acc.displayAccountDetails();

        acc.setBalance(7500);              // updating balance using setter
        System.out.println("\nUpdated Balance: " + acc.getBalance());

        SavingsAccount sa =
                new SavingsAccount(202, "Riya", 12000, 5.5);
        System.out.println();
        sa.displaySavingsDetails();
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    double interestRate;           // specific to SavingsAccount

    public SavingsAccount(int accNo, String holder,               
                           double balance, double interestRate) {          // constructor
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {       // method to display savings account details
        System.out.println("Savings Account Details");
        System.out.println("Account Number : " + accountNumber); // public
        System.out.println("Account Holder : " + accountHolder); // protected
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Balance        : " + getBalance()); // private via getter
    }
}

