package HotelReservationSystem;

public abstract class Room {
	private int roomNumber;
	private boolean isAvailable;
	protected double basePrice;       //'protected' allows child class to access it
	
	
	public Room(int roomno, double price) {  // Constructors of this class for initialization of instances variables
		this.roomNumber = roomno;
		this.basePrice = price;
		this.isAvailable = true;
		
	}
	public abstract double calculatePrice(); // Abstract Method: Every Room has its own price based on Luxury and Standard
	  
	
	public int getRoomNumber() {     // Method to get the Room NUmber
		return roomNumber; 
	}
	public boolean isAvailable() {          // Method to check the ROom is Available or not
		return isAvailable;
	}
	public void setAvailable(boolean available) {  // Method to set the Room availability
			isAvailable = available;
		
	}
	

}
