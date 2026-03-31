class SimulateAnATM {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    SimulateAnATM(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Main method
    public static void main(String[] args) {
        SimulateAnATM acc = new SimulateAnATM("Chennai", "ACC001", 700.0);

        System.out.println("State of " + acc.accountHolder);
        System.out.println();
        acc.displayBalance();
        acc.deposit(200.0);
        acc.withdraw(100.0);
        acc.withdraw(1000.0);
    }
}
