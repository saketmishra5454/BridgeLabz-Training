// Interface for GPS related work
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle {

    // encapsulation: private fields
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    // GPS data (secured)
    private String currentLocation = "Unknown";

    // constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // getters only (no setters for safety)
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    // protected GPS access
    protected void setLocation(String loc) {
        currentLocation = loc;
    }

    protected String getLocation() {
        return currentLocation;
    }

    // abstract method
    public abstract double calculateFare(double distance);
}

// Car class
class Car extends Vehicle implements GPS {

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 50; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Bike class
class Bike extends Vehicle implements GPS {

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // no base charge
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Auto class
class Auto extends Vehicle implements GPS {

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20; // small extra charge
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

// Main class
public class RideHailingSystem {

    // polymorphic method
    public static void processRide(Vehicle v, double distance) {

        v.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");

        // dynamic method call
        System.out.println("Total Fare: " + v.calculateFare(distance));

        // interface reference
        GPS gps = (GPS) v;
        gps.updateLocation("City Center");
        System.out.println("Current Location: " + gps.getCurrentLocation());

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        // polymorphism
        Vehicle v1 = new Car(101, "Ravi", 15);
        Vehicle v2 = new Bike(102, "Aman", 8);
        Vehicle v3 = new Auto(103, "Suresh", 10);

        processRide(v1, 12);
        processRide(v2, 12);
        processRide(v3, 12);
    }
}
