import java.util.ArrayList;
import java.util.List;

// Custom Exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

// Fare Calculator Interface
interface FareCalculator {
    double calculateFare(double distance);
}

// Normal pricing
class NormalFare implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 10; // ₹10 per km
    }
}

// Peak hour pricing
class PeakFare implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 15; // ₹15 per km
    }
}

// User class
class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Driver class
class Driver {
    private int driverId;
    private String name;
    private boolean available;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public String getName() {
        return name;
    }
}

// Ride class
class Ride {
    private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(User user, Driver driver,
                double distance, FareCalculator calculator) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = calculator.calculateFare(distance);
    }

    public void displayRide() {
        System.out.println("User   : " + user.getName());
        System.out.println("Driver : " + driver.getName());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare   : ₹" + fare);
        System.out.println();
    }
}

// Ride Management System
class RideService {

    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideHistory = new ArrayList<>();

    // add driver (CRUD - Create)
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    // book ride
    public void bookRide(User user, double distance, FareCalculator calculator)
            throws NoDriverAvailableException {

        Driver assignedDriver = null;

        for (Driver d : drivers) {
            if (d.isAvailable()) {
                assignedDriver = d;
                break;
            }
        }

        if (assignedDriver == null) {
            throw new NoDriverAvailableException(
                    "No drivers available at the moment");
        }

        assignedDriver.setAvailable(false);

        Ride ride = new Ride(user, assignedDriver, distance, calculator);
        rideHistory.add(ride);

        System.out.println("Ride booked successfully!");
        ride.displayRide();
    }

    // show ride history (CRUD - Read)
    public void showRideHistory() {
        System.out.println("Ride History:");
        for (Ride r : rideHistory) {
            r.displayRide();
        }
    }
}

// Main class
public class CarBooking {

    public static void main(String[] args) {

        RideService service = new RideService();

        // adding drivers
        service.addDriver(new Driver(1, "Abhisek"));
        service.addDriver(new Driver(2, "Suresh"));

        User user1 = new User(101, "Saket");
        User user2 = new User(102, "Riya");

        try {
            // normal pricing ride
            service.bookRide(user1, 12, new NormalFare());

            // peak pricing ride (polymorphism)
            service.bookRide(user2, 8, new PeakFare());

        } catch (NoDriverAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.showRideHistory();
    }
}
