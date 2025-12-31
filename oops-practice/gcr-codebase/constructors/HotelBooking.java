// Program for Hotel Booking System using Constructors

class HotelBooking {

    // booking details
    String guestName;
    String roomType;
    int nights;

    // default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
       
    }

    // parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
        // values assigned from parameters
    }

    // copy constructor
    HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }

    // method to display booking details
    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println(); // just for space
    }

    // main method
    public static void main(String[] args) {

        // booking using default constructor
        HotelBooking b1 = new HotelBooking();
        System.out.println("Default Booking:");
        b1.displayBooking();

        // booking using parameterized constructor
        HotelBooking b2 = new HotelBooking("Amit", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        b2.displayBooking();

        // booking using copy constructor
        HotelBooking b3 = new HotelBooking(b2);
        System.out.println("Copied Booking:");
        b3.displayBooking();
    }
}
