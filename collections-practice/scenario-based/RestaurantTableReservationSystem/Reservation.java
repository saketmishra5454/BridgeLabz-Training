import java.util.*;

public class RestaurantSystem {
    // Using Map for quick table lookup via table number
    private Map<Integer, Table> tables = new HashMap<>();
    // Using List to keep a history of all reservations
    private List<Reservation> reservations = new ArrayList<>();

    public RestaurantSystem() {
        // Initialize with some dummy tables
        tables.put(1, new Table(1, 2));
        tables.put(2, new Table(2, 4));
        tables.put(3, new Table(3, 6));
    }

    // Method to book a table
    public void reserveTable(int tableNumber, String name, String time) throws TableAlreadyReservedException {
        // Logic check: Iterate through list to see if that specific table/time is taken
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(time)) {
                throw new TableAlreadyReservedException("Error: Table " + tableNumber + " is already booked for " + time);
            }
        }

        // If no conflict found, add to list
        reservations.add(new Reservation(tableNumber, name, time));
        System.out.println("Success! Table " + tableNumber + " reserved for " + name);
    }

    // Method to remove a booking
    public void cancelReservation(int tableNumber, String time) {
        // Using removeIf to filter out the matching reservation
        boolean removed = reservations.removeIf(r -> r.tableNumber == tableNumber && r.timeSlot.equals(time));
        
        if (removed) {
            System.out.println("Reservation for Table " + tableNumber + " at " + time + " has been cancelled.");
        } else {
            System.out.println("No reservation found to cancel.");
        }
    }

    // Method to see what's available (Simple logic for a specific time)
    public void showAvailableTables(String time) {
        System.out.println("Available tables for " + time + ":");
        for (Integer tableNum : tables.keySet()) {
            boolean isBooked = false;
            for (Reservation r : reservations) {
                if (r.tableNumber == tableNum && r.timeSlot.equals(time)) {
                    isBooked = true;
                    break;
                }
            }
            if (!isBooked) {
                System.out.println("- Table " + tableNum + " (Capacity: " + tables.get(tableNum).capacity + ")");
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        RestaurantSystem system = new RestaurantSystem();

        try {
            system.reserveTable(1, "Alice", "7:00 PM");
            system.reserveTable(1, "Bob", "7:00 PM"); // This should trigger the exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7:00 PM");
        system.cancelReservation(1, "7:00 PM");
        system.showAvailableTables("7:00 PM");
    }
}