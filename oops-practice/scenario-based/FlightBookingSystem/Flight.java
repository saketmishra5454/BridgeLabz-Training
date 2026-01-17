package FlightBookingSystem;

public class Flight {            //this is the flight class
	private String flightNumber;               //these are instance variables
	private String source;
	private String destination;
	private double price;
	
	public Flight(String fn, String s, String d, double price) {      //constructor to initialize the variables
		this.flightNumber = fn;
		this.source = s;
		this.destination = d;
		this.price = price;
	}
	public String getFlightNumber() {        //Method to get the FlightNumber;
		return flightNumber;
	}
	public String getSource() {                 ////Method to get the source;
		return source;
	}
	public String getDestination() {     //Method to get the destination;
		return destination;
	}
	public double getPrice() {          //Method to get the price;
		return price;
	}
	
	@Override
	public String toString() {
		return "Flight No: "+flightNumber + " | From: "+ source + " To " + destination + " | Price:  "+ price;
	}

}
