import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Service Interface (Abstraction)
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();
}

// Base Account class
abstract class Account implements BankService {

    protected int accountNumber;
    protected double balance;
    protected List<String> transactionHistory = new ArrayList<>();

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionHistory.add("Account created with balance: " + balance);
    }

    // synchronized for thread safety
    @Override
    public synchronized void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
    }

    @Override
    public synchronized void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: " + amount);
    }

    public synchronized double getBalance() {
        return balance;
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}

// Savings Account
class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // polymorphism: interest logic
    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

// Current Account
class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // 1% interest
    }
}

// Bank utility class
class Bank {

    // synchronized fund transfer (multithreading safe)
    public static void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException {

        synchronized (Bank.class) {
            from.withdraw(amount);
            to.deposit(amount);
        }
    }
}

// Thread class for concurrent transactions
class TransactionThread extends Thread {

    private Account from;
    private Account to;
    private double amount;

    public TransactionThread(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            Bank.transfer(from, to, amount);
            System.out.println("Transfer successful: " + amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}

// Main class
public class OnlineBankingSystem {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, 5000);
        Account acc2 = new CurrentAccount(102, 3000);

        // checking balance
        System.out.println("Initial Balance Acc1: " + acc1.getBalance());
        System.out.println("Initial Balance Acc2: " + acc2.getBalance());

        // concurrent transactions
        Thread t1 = new TransactionThread(acc1, acc2, 2000);
        Thread t2 = new TransactionThread(acc1, acc2, 1500);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // final balances
        System.out.println("\nFinal Balance Acc1: " + acc1.getBalance());
        System.out.println("Final Balance Acc2: " + acc2.getBalance());

        // interest calculation (polymorphism)
        System.out.println("\nInterest Acc1: " + acc1.calculateInterest());
        System.out.println("Interest Acc2: " + acc2.calculateInterest());

        System.out.println();
        acc1.showTransactionHistory();
    }
}
