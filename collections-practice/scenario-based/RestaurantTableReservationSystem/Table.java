// Reservation class
public class Reservation {

    int tableNumber;
    String timeSlot;
    String customerName;

    public Reservation(int tableNumber, String timeSlot, String customerName) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
        this.customerName = customerName;
    }
}
