package exceptionHandling;

// Custom exception for low balance
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {

        super(msg);
    }
}

// Bank account class
class BankAccount {

    double balance = 5000;

    // Withdraw method
    void withdraw(double amt)
            throws InsufficientBalanceException {

        // Negative amount check
        if (amt < 0) {

            throw new IllegalArgumentException();

        }
        // Balance check
        else if (amt > balance) {

            throw new InsufficientBalanceException("Insufficient balance!");

        }
        // Successful withdraw
        else {

            balance = balance - amt;

            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }
}

public class BankSystem {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {

            // Trying to withdraw
            acc.withdraw(6000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid amount!");
        }
    }
}

