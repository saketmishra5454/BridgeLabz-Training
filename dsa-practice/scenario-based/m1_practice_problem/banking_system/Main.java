package collections.banking_system;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
      public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of operations you want");
		int n = sc.nextInt();
		
		System.out.println("1.Add Account\n2.Remove AccountNumber\n3.Deposit Amount\n4.Withdraw Amount\n5.Display");
		
		int i = 0;
		while(i<n) {
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Account details like: (AccNo.,name,bal)");
			int accNo = sc.nextInt();
			String name = sc.next();
			double bal = sc.nextDouble();
			bank.addAccount(new Account(accNo,name,bal));
			break;
			
     
		case 2:
			System.out.println("Enter the Account Number you want to remove:");
			bank.removeAccount(sc.nextInt());
			break;
			
		case 3:
			System.out.println("Enter the amount you want to deposit like: (accNo,amount)");
			bank.deposit(sc.nextInt(),sc.nextDouble());
			break;
			
		case 4:
			System.out.println("Enter the amount you want to withdraw like: (accNo,amount)");
			bank.withdraw(sc.nextInt(), sc.nextDouble());
			break;
			
		case 5:
			System.out.println("These are the details:");
			System.out.println();

			Collection<Account> accountList = bank.displayAllAccounts();

			for(Account acc : accountList){
				
				Integer accNum = acc.getAccountNumber();

				System.out.println("Account Number: "+ accNum);
				System.out.println("Customer Name: "+acc.getCustomerName());
				System.out.println("Current Balance: "+ acc.getBalance());

				System.out.println("--------------------------------------------------");
			}

		default:
			System.out.println("Invalid Input");
		}
		i++;
	
	}
}
}
