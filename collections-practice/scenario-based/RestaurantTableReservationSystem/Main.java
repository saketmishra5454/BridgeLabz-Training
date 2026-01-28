// main class to test the program
public class Main {

    public static void main(String[] args) {

        RestaurantReservationSystem system = new RestaurantReservationSystem();

        // adding tables
        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 2));
        system.addTable(new Table(3, 6));

        try {
            system.reserveTable(1, "7PM-8PM", "Rahul");
            system.reserveTable(2, "7PM-8PM", "Aman");

            // this will throw exception
            system.reserveTable(1, "7PM-8PM", "Riya");

        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7PM-8PM");

        system.cancelReservation(1, "7PM-8PM");

        system.showAvailableTables("7PM-8PM");
    }
}
