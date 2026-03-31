package FlightBookingSystem;

import java.util.Scanner;

public class Main {             // this is the main class 
    public static void main(String[] args) {
    	FlightBookingManager manager = new FlightBookingManager();
    	Scanner sc = new Scanner(System.in);         
    	
    	//Search 
    	System.out.println("ENter the Destination to search: ");
    	String searchDest = sc.nextLine();
    	manager.searchFlights(searchDest);
    	
    	//Book
    	System.out.println("Enter Flight Number to Book: ");
    	String fNum = sc.nextLine();
    	System.out.println("Enter the Passanger Name: ");
    	String pName = sc.nextLine();
    	
    	manager.bookFlight(pName, fNum);
    	
    	//View
    	manager.showMyBookings();
    }
 
}
