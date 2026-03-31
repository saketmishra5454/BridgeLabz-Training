package collections.M1_Practice.set1.global_payment_transaction_validator;


import java.util.*;
import java.time.*;

public class TransactionValidator {

    // allowed currency values
    static Set<String> currencies = Set.of("USD","EUR","INR","JPY","GBP");

    // allowed transaction status
    static Set<String> statuses = Set.of("SUCCESS","FAILED","PENDING","REVERSED");


    // =============================
    // Validate Transaction ID
    // =============================
    public static boolean validateId(String id){
    	
    	if(!id.matches("^TXN-[1-9][0-9]{5}$")) {
    		return false;
    	}
    		String digits = id.substring(4);
    		
    		int count = 1;
    		for(int i = 1; i<digits.length();i++) {
    			if(digits.charAt(i) == digits.charAt(i-1)) {
    				count++;
    		}
    			if(count > 2) {
    				return false;
    			}
    	}
    	

        // check format TXN-XXXXXX using regex

        // ensure first digit not zero

        // check no digit repeats more than 2 times consecutively

        return true;
    }


    // =============================
    // Validate Date
    // =============================
    public static boolean validateDate(String date){
    	
    	try {

    	LocalDate d = LocalDate.parse(date);
    	
    	int year = d.getYear();
    	
    	if(year<2010 || year>2025) {
    		return false;
    	}
    	return true;
    	}
    	catch(Exception e) {
    		return false;
    	}
    }
    	
    
    	
    
    	
    	
    	
    	
        // use LocalDate.parse()

        // catch invalid dates

        // check year between 2010 and 2025

      


    // =============================
    // Validate Currency
    // =============================
    public static boolean validateCurrency(String currency){

        // check if currency exists in allowed set

        return currencies.contains(currency);
    }


    // =============================
    // Validate Amount
    // =============================
    public static boolean validateAmount(String amount){

        // regex check for decimal format
    	
    	if(!amount.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?")) {
    		return false;
    	}
         
    	double amt = Double.parseDouble(amount);
    	if(amt<=0 || amt>500000.00) {
    		return false;
    	}

        // convert to double

        // ensure value > 0 and <= 500000.00

        return true;
    }


    // =============================
    // Validate Status
    // =============================
    public static boolean validateStatus(String status){

        // check if status exists in allowed set
    	

        return statuses.contains(status);
    }


    // =============================
    // Validate Full Record
    // =============================
    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");

        // check record contains exactly 5 fields

        if(parts.length != 5)
            return false;

        if(!validateId(parts[0]))
            return false;

        if(!validateDate(parts[1]))
            return false;

        if(!validateCurrency(parts[2]))
            return false;

        if(!validateAmount(parts[3]))
            return false;

        if(!validateStatus(parts[4]))
            return false;

        return true;
    }


    // =============================
    // Main Method
    // =============================
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("VALID TRANSACTION");
            else
                System.out.println("INVALID TRANSACTION");
        }
    }
}