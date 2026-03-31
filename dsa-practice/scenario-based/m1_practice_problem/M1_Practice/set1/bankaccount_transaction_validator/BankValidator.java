package collections.M1_Practice.set1.bankaccount_transaction_validator;

import java.util.*;
import java.time.*;

public class BankValidator {

    static Set<String> types = Set.of("DEPOSIT","WITHDRAW","TRANSFER");
    static Set<String> statuses = Set.of("SUCCESS","FAILED","PENDING");

    public static boolean validateId(String id){

        // regex ACC-XXXXX
    	
    	if(id == null || id.trim().isEmpty()) {
    		return false;
    		
    	}
    	
    	
    	if(!id.matches("^ACC-[1-9][0-9]{4}")) {
    		//System.out.println("Id check nhhi ho rhi h tujse");
    		return false;
    	}
    	
    

        return true;
    }

    public static boolean validateDate(String date){

        // LocalDate parse
    	try {
    	LocalDate d = LocalDate.parse(date);
    	
    	int year = d.getYear();
    	
    	if(year < 2018 || year > 2025) 
    		return false;
    	}
    	
    	catch(Exception e) {
    		return false;
    	}

        return true;
    }

    public static boolean validateType(String type){

        return types.contains(type);
    }

    public static boolean validateAmount(String amount){

        // regex + range
    	
    	if(amount == null || amount.trim().isEmpty()) return false;
    	
    	if(!amount.matches("^(0|[1-9]\\d*)(\\.\\d{1,2})?$")) {
    		return false;
    	}
    	try {
    	double amt = Double.parseDouble(amount);
    	
    	if(amt < 0 || amt >1000000) {
    		return false;
    	}
    	}
    	catch(NumberFormatException e) {
    		return false;
    	}
    	

        return true;
    }

    public static boolean validateStatus(String status){

        return statuses.contains(status);
    }

    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");
        
        if(parts.length != 5) return false;

        return validateId(parts[0]) && validateDate(parts[1]) && validateType(parts[2]) &&
        		validateAmount(parts[3]) && validateStatus(parts[4]);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter:");

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