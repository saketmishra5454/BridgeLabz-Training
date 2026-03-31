package collections.M1_Practice.set1.Logistics_container_validator;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;

public class ContainerValidator {

    static Set<String> types = Set.of("DRY","REEFER","OPEN_TOP","TANK");
    static Set<String> statuses = Set.of("LOADED","IN_TRANSIT","DELIVERED","DAMAGED");

    public static boolean validateCode(String code){

        // regex CNT-XXXXXX
    	
    	if(!code.matches("^CNT-[1-9][0-9]{5}")) {
    //		System.out.println("code me mistake h");
    		return false;
    	}
    //   System.out.println("code shi h");
    	String num = code.substring(4);
    	int count = 1;
    	for(int i = 1; i<num.length();i++) {
    		if(num.charAt(i) == num.charAt(i-1)) {
    			count++;
    		}
    		
    		if(count>2) {
    			return false;
    		}
    		
    	}
        return true;
        
    }

    public static boolean validateDate(String date){

        // LocalDate parse
    	try {
    	LocalDate.parse(date);
    //	System.out.println("date shi h");
    	return true;
    	}
    	
    	catch(DateTimeParseException e) {
    	//	System.out.println("date me galti h");
    		return false;
    	}
    	
    	
       // return true;
    }

    public static boolean validateType(String type){

        // check in set

        return types.contains(type);
    }

    public static boolean validateWeight(String weight){

        // regex
    	if(!weight.matches("^(0|[1-9]\\d+)(\\.\\d{1,2})?$")) {
    	//	System.out.println("Weight me galti h");
    		return false;
    	}
    	
    	double d = Double.parseDouble(weight);
    	
    	if(d>50000) {
    	//	System.out.println("Weight check krna nhi aaya");
    		return false;
    		
    	}
  
        return true;
    }

    public static boolean validateStatus(String status){

        // check in set

        return statuses.contains(status);
    }

    public static boolean validateRecord(String record){
    	
    	
        String[] parts = record.split("\\|");

        // validate fields
        if(parts.length != 5) return false;
        if(validateCode(parts[0]) && validateDate(parts[1]) && validateType(parts[2]) && validateWeight(parts[3]) 
        		&& validateStatus(parts[4])) {
        	
        	//System.out.println("Validate krna shi aaya reeee");
        	return true;
        }
        
        else {
        	
        //	System.out.println("Validate bhi nhi rha h yrr	");
        	return false;
        }
//        	return false;
//        }
//
//        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("VALID CONTAINER");
            else
                System.out.println("INVALID CONTAINER");
        }
    }
}
