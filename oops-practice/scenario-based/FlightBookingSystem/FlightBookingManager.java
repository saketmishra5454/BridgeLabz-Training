package FlightBookingSystem;

import java.util.List;
import java.util.ArrayList;

public class FlightBookingManager {  // This is the Flight Booking class
	
	private Flight[] availableFlights;         //it will store the available flights
	private List<Booking> userBookings;     // it will store the users booking
	
	public FlightBookingManager() {
		
		availableFlights = new Flight[] {         // these flights are available
				new Flight("AI-101", "Delhi", "Mumbai", 5000),
	            new Flight("6E-202", "Bangalore", "Goa", 3500),
	            new Flight("UK-303", "Kolkata", "Delhi", 4500)
		};
		userBookings = new ArrayList<>();
		
	}
	public void searchFlights(String dest) {       // Method to search the flight
		System.out.println("Searching for the flights to "+ dest);
		boolean found = false;
		
		for (Flight f : availableFlights) {
			if(f.getDestination().equalsIgnoreCase(dest)) {
				System.out.println("Flight is Found: " + f);
				found = true;
			}
		}
		if(!found) System.out.println("No Flight found to "+ dest);
	}
	
	public void bookFlight(String passenger, String flightnum) {       //Method to book the Flight
		for(Flight f : availableFlights) {
			if(f.getFlightNumber().equals(flightnum)) {
				userBookings.add(new Booking(passenger, f));
				System.out.println("Booking is Successful for "+ passenger);
				return;
			}
		}System.out.println("Flight Not FOUND!!");
		
	}
	public void showMyBookings() {             //Method to show the MyBookings
		System.out.println("------YOUR BOOkINGS------");
		for(Booking b : userBookings) {
			b.displayBookingDetails();
		}
	}
	

}
