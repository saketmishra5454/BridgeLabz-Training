//Program to demonstrate inheritance with different types of bank accounts

class BankAccount {           //Base Class
    protected int accountNumber;    //Common Attribute
    protected double balance;       //Common Attribute

    public BankAccount(int accNo, double bal){      //Parameterized Constructor
        this.accountNumber = accNo;
        this.balance = bal;
    }
   
}
class SavingsAccount extends BankAccount{            //Derived Class
    int interestRate;
    public SavingsAccount(int accNo,double bal,int intRate){     //Parameterized Constructor
        super(accNo,bal);
        this.interestRate = intRate;
    }
    public void displaySavingsDetail(){             //Method to display savings account details
        System.out.println("------Savings Account Details------:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: Savings Account");
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");

    }
}

class CheckingAccount extends BankAccount{      //Derived Class
    int withdrawalLimit;
    public CheckingAccount(int accNo,double bal, int withLimit){    //Parameterized Constructor
        super(accNo,bal);
        this.withdrawalLimit = withLimit;
    }
    public void displayAccountType(){         //Method to display checking account details
        System.out.println("------Checking Account Details------:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: Checking Account");
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Limit: " + withdrawalLimit);

    }
}
class FixedDepositAccount extends BankAccount{       //Derived Class
    int tenure;
    public FixedDepositAccount(int accNo,double bal, int tenure){           //Parameterized Constructor
        super(accNo,bal);
        this.tenure = tenure;
    }
    public void displayFDDetails(){      //Method to display fixed deposit account details
        System.out.println("------Fixed Deposit Account Details------:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Balance: " + balance);
        System.out.println("Tenure: " + tenure + " years");

    }
}

public class BankAccountTypes{           //Main Class
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(1001,5000.0,5);    //Creating object of SavingsAccount class
        sa.displaySavingsDetail();
        CheckingAccount ca = new CheckingAccount(1002,10000.0,2000);     //Creating object of CheckingAccount class
        ca.displayAccountType();
        FixedDepositAccount fa = new FixedDepositAccount(1003,20000.0,3);    //Creating object of FixedDepositAccount class
        fa.displayFDDetails();
        
    }
}
