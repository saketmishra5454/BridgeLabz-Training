package HotelReservationSystem;

public class StandardRoom extends Room {    // Standard class inherits the Room class properties
	public StandardRoom(int roomNumber) {
		super(roomNumber,1000);        // standard price is 1000;
		
	}
	@Override
	public double calculatePrice() {
		return basePrice;                   //no extra charges
	}
}

class DeluxeRoom extends Room{               //// Luxury class inherits the Room class properties
	public DeluxeRoom(int roomNumber) {
		super(roomNumber,2500);            // Luxury Price is 2500
	}
	public double calculatePrice() {
		return basePrice+(basePrice*0.2);  // for 20% Luxury Tax
	}
}

