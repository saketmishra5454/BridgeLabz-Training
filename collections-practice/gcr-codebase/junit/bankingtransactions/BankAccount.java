package junit.bankingtransactions;

public class BankAccount {
    double balance = 0.0;

    public void deposit(double amt){         // method to add the amount
         balance += amt;
    }
    public void withdraw(double amt){           // method to withdraw amount
        if(amt>balance){
            throw new IllegalArgumentException();
        }
        balance -= amt;
    }
    public double getBalance(){          //method to get balance
        return balance;
    }

}
