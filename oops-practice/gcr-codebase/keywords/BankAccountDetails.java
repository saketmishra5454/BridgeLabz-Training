//Banking System with Keywords: this, static, final, instanceof
public class BankAccountDetails {

    // static variable 
    static String bankName = "State bank of India";
    static int totalAccounts = 0;

    // instance variables
    String accountHolderName;
    final String accountNumber;   // final variable
    double balance;

    // constructor using this keyword
    public BankAccountDetails(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // display details using instanceof
    public void displayDetails(Object obj) {
        if (obj instanceof BankAccountDetails) {
            BankAccountDetails acc = (BankAccountDetails) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Balance: $" + acc.balance);
        }
    }

    // static method
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // main method
    public static void main(String[] args) {

        BankAccountDetails acc1 =
                new BankAccountDetails("Lynda Princy", "ACC12345", 1000.0);    // create first account

        BankAccountDetails acc2 =
                new BankAccountDetails("Prince Danish", "ACC67890", 500.0);        // create second account

        System.out.println("Account 1 Details:");
        acc1.displayDetails(acc1);

        System.out.println("\nAccount 2 Details:");
        acc2.displayDetails(acc2);

        getTotalAccounts();         // display total accounts

        System.out.println("\nPerforming transactions on Account 1:");                
        acc1.deposit(200.0);                 
        acc1.withdraw(150.0);

        acc1.displayDetails(acc1);
        acc2.displayDetails(acc2);

        acc2.deposit(100.0);
        acc2.withdraw(1000.0);
    }
}
