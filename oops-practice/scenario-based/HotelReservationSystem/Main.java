package HotelReservationSystem;


import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		List<Room> hotelInventory = new ArrayList<>();
		hotelInventory.add(new StandardRoom(101));
		hotelInventory.add(new DeluxeRoom(202));
		
		
		System.out.println("Available Rooms:");
        for (Room r : hotelInventory) {
            String type = (r instanceof DeluxeRoom) ? "Deluxe" : "Standard";
            System.out.println("Room " + r.getRoomNumber() + " [" + type + "] - Price: ₹" + r.calculatePrice());
        }

        // Simulating a booking
        Room selectedRoom = hotelInventory.get(1); // Picking the Deluxe Room
        
        if (selectedRoom.isAvailable()) {
            Reservation res = new Reservation("Saket", selectedRoom, 3);
            res.generateInvoice();
            selectedRoom.setAvailable(false);
        }
    }
}
	


