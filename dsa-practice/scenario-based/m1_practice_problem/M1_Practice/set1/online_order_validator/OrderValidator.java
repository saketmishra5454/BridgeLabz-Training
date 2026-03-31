package collections.M1_Practice.set1.online_order_validator;

import java.util.*;
import java.time.*;

public class OrderValidator {

    static Set<String> categories = Set.of(
        "ELECTRONICS","CLOTHING","GROCERY","FURNITURE"
    );

    static Set<String> statuses = Set.of(
        "PLACED","SHIPPED","DELIVERED","CANCELLED"
    );

    public static boolean validateId(String id){
    	
    	if(!id.matches("^ORD-[1-9][0-9]{5}$")) {
    		//System.out.println("id shi nahi check ho rhi h");
    		return false;
    	}
    	
    	String digits = id.substring(4);
    	int count = 1;
    	for(int i = 1; i<digits.length();i++) {
    		if(digits.charAt(i) == digits.charAt(i-1)) {
    			count++;
    		}
    		
    		if(count>2) {
    			//System.out.println("count 2 se jyda h");
    			return false;
    		}
    	}

        // regex ORD-XXXXXX

        // check repetition rule
    	
    	//System.out.println("Id ek dum shi h Reee");

        return true;
    }

    public static boolean validateDate(String date){

        // LocalDate parse
    	try {
    	LocalDate d = LocalDate.parse(date);
    	
    	int year = d.getYear();
    	
    	if(year<2020 || year>2025) {
    		System.out.println("Year Range me nhi h");
    		return false;
    	}
    	
    	}
    	catch(Exception e) {
    		return false;
    	}
        // year range check
    	
    	//System.out.println("Date bhi ek sum shi h");

        return true;
    }

    public static boolean validateCategory(String category){

        // check in set

        return categories.contains(category);
    }

    public static boolean validatePrice(String price){

        // regex + double parsing
    	if (price == null || price.trim().isEmpty()) {
    	    return false;
    	}
    	
    	if(!price.matches("^(0|[1-9]\\d*)(\\.\\d{1,2})?$")) {
    	//	System.out.println("Price check nhi ho rha tujhse ");
    		return false;
    	}
    	
    	double pri = Double.parseDouble(price);
    	try {
    	if(pri<0 || pri>100000) {
    		//System.out.println("Price Range me nhi h ");
    		return false;
    	}
    	}
    	
    	catch(NumberFormatException e) {
    		return false;
    	}
    	
    	
        // range check
    	
    	//System.out.println("Price bhi shi se check ho gya ");

        return true;
    }

    public static boolean validateStatus(String status){

        return statuses.contains(status);
    }

    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");

        // validate all fields
        
        if(parts.length!=5) {
        	return false;
        }
        
        
        

        return validateId(parts[0]) && validateDate(parts[1]) && validateCategory(parts[2])
        		
        		&& validatePrice(parts[3]) && validateStatus(parts[4]);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENter");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("VALID ORDER");
            else
                System.out.println("INVALID ORDER");
        }
    }
}