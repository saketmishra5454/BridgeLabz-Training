package HotelReservationSystem;

public class Reservation {       //this is the reservation class
    private String guestName;
    private Room room;
    private int days;

    public Reservation(String guestName, Room room, int days) {    //initialization of instance variables
        this.guestName = guestName;
        this.room = room;
        this.days = days;
    }

    public void generateInvoice() {                    //Method to display the details
        double total = room.calculatePrice() * days;
        System.out.println("--- INVOICE ---");
        System.out.println("Guest: " + guestName);
        System.out.println("Room No: " + room.getRoomNumber());
        System.out.println("Total Amount: ₹" + total);
        System.out.println("----------------");
    }
}