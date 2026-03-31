package collections.M1_Practice.set1.secure_user_account_validator;

import java.util.*;
import java.time.*;

public class UserValidator {

    static Set<String> roles = Set.of("ADMIN","USER","MANAGER","SUPPORT");
    static Set<String> statuses = Set.of("ACTIVE","INACTIVE","SUSPENDED");

    public static boolean validateUserId(String id){
    	
    	
    	if(!id.matches("USR-[1-9][0-9]{4}")) {
    		return false;
    	}

        // regex USR-XXXXX

        // first digit not zero

        return true;
    }

    public static boolean validateDate(String date){
    	
    	try {
    	LocalDate d = LocalDate.parse(date);
    	
    	int year = d.getYear();
    	
    	if(year<2015 || year>2025) {
    		return false;
    	}
    	}
    	
    	catch(Exception e) {
    		
    		return false;
    	}
    		
    	return true;
    }

    public static boolean validateRole(String role){

        // check in set
    	
        return roles.contains(role);
    }

    public static boolean validateSalary(String salary){
    	
    	
    	if(!salary.matches("^(0|[1-9]\\d+)(\\.\\d{1,2})?$")) {
    	    return false;
    	}

    	try {
    		
    		double sal = Double.parseDouble(salary);
    		if(sal < 30000 || sal > 500000) {
    			return false;
    		}
    		return true;
    	}
    	
    	catch(Exception e) {
    		return false;
    	}
    }
    	

        // regex decimal

        // convert to double

        // check range 30000–500000

    

    public static boolean validateStatus(String status){

        // check in set
    	
        return statuses.contains(status);
    }

    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");
        
        if(parts.length != 5) {
        	return false;
        }
        
        if(!validateUserId(parts[0])) {
        	return false;
        }
        if(!validateDate(parts[1])) {
        	return false;
        }

        // validate all fields
        
        if(!validateRole(parts[2])) {
        	return false;
        }
        
        if(!validateSalary(parts[3])) {
        	return false;
        }
        
        if(!validateStatus(parts[4])) {
        	return false;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter:");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("VALID USER");
            else
                System.out.println("INVALID USER");
        }
    }
}
