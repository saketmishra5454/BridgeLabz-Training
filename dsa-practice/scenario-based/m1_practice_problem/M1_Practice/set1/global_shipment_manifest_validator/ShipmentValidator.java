package collections.M1_Practice.set1.global_shipment_manifest_validator;

import java.util.*;
import java.time.*;

class ShipmentValidator {

    static Set<String> modes = Set.of(
        "AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"
    );

    static Set<String> statuses = Set.of(
        "DELIVERED","CANCELLED","IN_TRANSIT"
    );

    public static boolean validateCode(String code){

        // check regex SHIP-XXXXXX
    	if(!code.matches("^SHIP-[1-9][0-9]{5}$")) {
    		return false;
    	}
    		
    		String digits = code.substring(5);   
    		int count = 1;
    		
    		for(int i = 1; i<digits.length();i++) {
    			if(digits.charAt(i) == digits.charAt(i-1)) {
    				count++;
    				
    				if(count>3) {
    					return false;
    				}
    			}
    				
    			else {
    				count = 1;
    				}
    			}
    	
    		
    	return true;
    			

        // ensure first digit not 0

        // check digit repetition rule
    }
    public static boolean validateDate(String date){

        // check YYYY-MM-DD format
    	try {
    	LocalDate d = LocalDate.parse(date);
    	int year = d.getYear();
    	
    	if(year < 2000 || year > 2099) {
    		return false;
    	}

        return true;
    }
    catch(Exception e) {
    	return false;
    }
    }
    public static boolean validateMode(String mode){

        // check if mode exists in allowed set
    	
    	return modes.contains(mode);
    	
    }


    public static boolean validateWeight(String weight){

        // regex check
    	if(!weight.matches("(0|[1-9]\\d{0,4})(\\.\\d{1,2})?")) {
    		return false;
    	}
    		
    		double w = Double.parseDouble(weight);
    		
    		if(w<=0 || w>999999.9) {
    			return false;
    		}	
    		
    		return true;
    	}

    

    public static boolean validateStatus(String status){

        // check allowed statuses
    	
    	if(!statuses.contains(status)) {
    		return false;
    	}
    	

        return true;
    }

    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");

        if(parts.length != 5)
            return false;

        if(!validateCode(parts[0]))
            return false;

        if(!validateDate(parts[1]))
            return false;

        if(!validateMode(parts[2]))
            return false;

        if(!validateWeight(parts[3]))
            return false;

        if(!validateStatus(parts[4]))
            return false;

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("COMPLIANT RECORD");
            else
                System.out.println("NON-COMPLIANT RECORD");
        }
    }
}
