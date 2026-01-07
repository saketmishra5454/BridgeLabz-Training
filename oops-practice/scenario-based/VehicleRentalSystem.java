// Interface for insurance related stuff
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {

    // encapsulation: making variables private
    private String vehicleNumber;
    private String type;
    protected double rentalRate; // protected so child class can use

    // sensitive data (insurance policy no)
    private String insurancePolicyNumber;

    // constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // no setter for insurancePolicyNumber to keep it safe
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // abstract method
    public abstract double calculateRentalCost(int days);
}

// Car class
class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance, Policy No: " + getInsurancePolicyNumber();
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance, Policy No: " + getInsurancePolicyNumber();
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra charge for truck
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance, Policy No: " + getInsurancePolicyNumber();
    }
}

// Main class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        // polymorphism: parent reference holding child objects
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR101", 1500, "CAR-POL-11");
        vehicles[1] = new Bike("BIKE202", 500, "BIKE-POL-22");
        vehicles[2] = new Truck("TRK303", 3000, "TRK-POL-33");

        int days = 5;

        for (Vehicle v : vehicles) {
            System.out.println("----------------------------");
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());

            double rent = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rent);

            // casting to interface for insurance
            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
        }
    }
}
