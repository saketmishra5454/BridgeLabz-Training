package RestaurantTableReservationSystem;
// custom exception class
public class TableAlreadyReservedException extends Exception {

    public TableAlreadyReservedException(String message) {
        super(message);
    }
}
