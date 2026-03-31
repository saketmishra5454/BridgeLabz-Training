package collections.banking_system;

import collections.banking_system.Account;

import java.util.*;

class Bank {

    private Map<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
    	
        // Write logic
    	if(account == null) {
    		return;
    	}
    	
    	int accno = account.getAccountNumber();
        if(!accounts.containsKey(accno)){
            accounts.put(accno,account);
            System.out.println("Account Added Successfully");
        }
        else {
        	System.out.println("Account Already Exists");
        }

    }

    public void removeAccount(int accountNumber) {
        // Write logic
//    	if(accounts.containsKey(accountNumber)) {
//    		accounts.remove(accountNumber);
//    		System.out.println("Account has been Removed");
//    	}
//    	else {
//    		System.out.println("Account not Removed");
//    	}
//    	
//    }
    
    Account removedAccount = accounts.remove(accountNumber);
    
    if(removedAccount != null) {
    	System.out.println("Account has been Removed");
    }
    else {
    	System.out.println("Account not Found");
    }
    }

    public void deposit(int accountNumber, double amount) {
        // Write logic
    	
    	Account acc = accounts.get(accountNumber);
    	
    	if(acc!=null) {
    		double newbal = acc.getBalance()+amount;
    		
    		acc.setBalance(newbal);
    		System.out.println("Amount has been deposited Successfully.");
    		System.out.println("Updated Balance: "+ newbal);
    	}
    	
    	else {
    		System.out.println("Account Not Found/Invalid AccountNumber");
    	}	
    	
    }


    public void withdraw(int accountNumber, double amount) {
        // Write logic
    	
    	Account acc = accounts.get(accountNumber);
    	
    	if(acc != null) {
    		if (acc.getBalance() >= amount) {
    			
    		double newbal = acc.getBalance()-amount;
    		
    		acc.setBalance(newbal);

            System.out.println("Amount has beed WithDraw Successfully ");
            System.out.println("Updated Balance: "+ newbal);
   
    	}
    		else {
                System.out.println("Insufficient Balance");
    		}
    	}
        else{
            System.out.println("Account not Found/ Invalid AccountNumber");
        }
    }
    
    public void display(Map<Integer,Account> acc) {
    	
    	for(Map.Entry<Integer, Account> entry : acc.entrySet()) {
    		Integer accNo = entry.getKey();
    		Account account = entry.getValue();
    		
    		System.out.println("Account Number: "+ accNo);
    		System.out.println("Customer Name: "+account.getCustomerName());
    		System.out.println("Current Balance: "+ account.getBalance());
    		
    		System.out.println("--------------------------------------------------");
    	}
    	
    }

	public Collection<Account> displayAllAccounts() {
		
		return accounts.values();
	}
    
}