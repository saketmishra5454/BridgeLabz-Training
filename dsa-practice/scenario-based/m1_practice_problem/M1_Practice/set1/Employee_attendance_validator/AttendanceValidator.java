package collections.M1_Practice.set1.Employee_attendance_validator;

import java.util.*;
import java.time.*;



public class AttendanceValidator {

    static Set<String> shifts = Set.of("MORNING","EVENING","NIGHT");
    static Set<String> statuses = Set.of("PRESENT","ABSENT","LEAVE");

    public static boolean validateId(String id){

        // regex EMP-XXXXX
    	if(id == null || id.trim().isEmpty()) {
    		return false;
    	}
    	
    	if(!id.matches("^EMP-[1-9][0-9]{4}$")) {
    		return false;
    	}

        return true;
    }

    public static boolean validateDate(String date){
    	
    	if(date == null || date.trim().isEmpty()) {
    		return false;
    	}
    	
    	try {
    	LocalDate d = LocalDate.parse(date);
    	
    	int year  = d.getYear();
    	if(year<2020 || year > 2025) {
    		return false;
    	}
    	}
    	
    	catch(Exception e) {
    		return false;
    	}


        return true;
    }

    public static boolean validateShift(String shift){

        return shifts.contains(shift);
    }

    public static boolean validateHours(String hours){

        // range + decimal check
    	if(hours == null || hours.trim().isEmpty()) return false;
    	
    	try {
    	if(!hours.matches("^(?:[1-9]|1[0-2])(\\.\\d{1,2})?$")) {
    	//	System.out.println("tujhse hours check nhi ho rha h");
    		return false;
    	}
    	
    	}
    	catch(Exception e) {
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

        return validateId(parts[0]) && validateDate(parts[1]) && validateShift(parts[2]) 
        		&& validateHours(parts[3]) && validateStatus(parts[4]);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String record = sc.nextLine();

            if(validateRecord(record))
                System.out.println("VALID RECORD");
            else
                System.out.println("INVALID RECORD");
        }
    }
}