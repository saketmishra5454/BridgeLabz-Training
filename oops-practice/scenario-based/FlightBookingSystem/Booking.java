package FlightBookingSystem;

public class Booking {            //Booking class
	private String passengerName;
	private Flight flight;
	
	public Booking(String passengerName,Flight flight) {     //constructor to initialize the variables
		this.passengerName = passengerName;
		this.flight = flight;
	}
	public void displayBookingDetails() {           //Method to display the booking Details
		System.out.println("Passenger: "+passengerName +" | Flight Number: "+flight.getFlightNumber());
	}
}
