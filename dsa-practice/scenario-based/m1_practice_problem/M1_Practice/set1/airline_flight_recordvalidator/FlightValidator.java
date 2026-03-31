package collections.M1_Practice.set1.airline_flight_recordvalidator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.*;

public class FlightValidator {

    static Set<String> airports = Set.of("DEL","LHR","DXB","JFK","SIN","SYD");

    // Validate Flight Number
    public static boolean validateFlightNumber(String number){
    	
    	String regex = "FLT-[1-9][0-9]{3}";
    	
    	Pattern pattern = Pattern.compile(regex); 
    	
    	Matcher matcher = pattern.matcher(number);
    	
    	if(!matcher.matches()){
    		return false;
    	}
    	

        // regex FLT-XXXX

        // first digit not 0

        return true;
    	
    }

    // Validate Date
    public static boolean validateDate(String date){

        // use LocalDate.parse()
    	
    	try {
    	LocalDate d = LocalDate.parse(date);
    	
    	int year = d.getYear();
    	
    	if(year<2020 || year>2030){
    		return false;
    	}
    	}
    	
    	catch(Exception e) {
    		return false;
    		
    	}
    	return true;
    	
        // check year range 2020–2030

    }

    // Validate Locations
    public static boolean validateLocation(String origin, String destination){

        // check both in set
    	
    	if(origin.equals(destination)) {
    		return false;
    	}
    	else {
    	if(!(airports.contains(origin) || airports.contains(destination))) {
    		return false;
    	}
    	}

        // ensure origin != destination

        return true;
    }

    // Validate Seats
    public static boolean validateSeats(String seats){

        // convert to integer
    	
    	
    	if(seats == null  || seats.trim().isEmpty()) {
    		return false;
    	}
    	 int  seatCount = Integer.parseInt(seats);
    	 
    	 if(seatCount< 50 || seatCount>400) {
    		 return false;
    	 }

        // check range 50–400

        return true;
    }

    public static boolean validateRecord(String record){

        String[] parts = record.split("\\|");

        // check length
        if(parts.length != 5) {
        	return false;
        }
        
        if(!validateFlightNumber(parts[0])) {
        	return false;
        	
        }
        if(!validateDate(parts[1])) {
        	return false;
        }
        
        if(!validateLocation(parts[2],parts[3])) {
        	return false;
        	
        }
        
        if(!validateSeats(parts[4])) {
        	return false;
        }

        // call all validations

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
                System.out.println("VALID FLIGHT");
            else
                System.out.println("INVALID FLIGHT");
        }
    }
}