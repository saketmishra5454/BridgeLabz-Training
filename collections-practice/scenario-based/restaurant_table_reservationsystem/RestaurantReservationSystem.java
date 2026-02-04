package restaurant_table_reservationsystem;
import java.util.*;

// main reservation system class
public class RestaurantReservationSystem {

    // Map to store tables
    Map<Integer, Table> tables = new HashMap<>();

    // List to store reservations
    List<Reservation> reservations = new ArrayList<>();

    // method to add table
    public void addTable(Table table) {
        tables.put(table.tableNumber, table);
    }

    // method to reserve table
    public void reserveTable(int tableNumber, String timeSlot, String customerName)
            throws TableAlreadyReservedException {

        // checking if table exists
        if (!tables.containsKey(tableNumber)) {
            System.out.println("Table not found.");
            return;
        }

        // logic to prevent double booking
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved for " + timeSlot);
            }
        }

        // if no conflict then reserve
        reservations.add(new Reservation(tableNumber, timeSlot, customerName));
        System.out.println("Table reserved successfully for " + customerName);
    }

    // method to cancel reservation
    public void cancelReservation(int tableNumber, String timeSlot) {

        Iterator<Reservation> it = reservations.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                it.remove();
                found = true;
                System.out.println("Reservation cancelled successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("No reservation found.");
        }
    }

    // method to show available tables
    public void showAvailableTables(String timeSlot) {

        System.out.println("Available tables for time slot: " + timeSlot);

        for (Table table : tables.values()) {
            boolean isReserved = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == table.tableNumber && r.timeSlot.equals(timeSlot)) {
                    isReserved = true;
                    break;
                }
            }

            if (!isReserved) {
                System.out.println("Table No: " + table.tableNumber +
                        " | Capacity: " + table.capacity);
            }
        }
    }
}
