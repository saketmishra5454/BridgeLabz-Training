package restaurant_table_reservationsystem;
// custom exception class
public class TableAlreadyReservedException extends Exception {

    public TableAlreadyReservedException(String message) {
        super(message);
    }
}
