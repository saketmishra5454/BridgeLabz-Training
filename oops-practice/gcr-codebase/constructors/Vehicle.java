//vehicle RegistrationFee Program

public class Vehicle {          // Vehicle class with constructors and static variable
    String ownerName;
    String vehicleType;

    static int registrationFee = 500;         // static variable shared by all instances

    Vehicle(String name, String vehicleType){    // parameterized constructor
        this.ownerName = name;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){           // method to display vehicle details
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }
    void updateRegistrationFee(int newFee){             // method to update static variable
        Vehicle.registrationFee = newFee;
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Bike");
        vehicle1.displayVehicleDetails();
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------------------------------------------"); // just for gap
        vehicle1.updateRegistrationFee(700); // updating static variable using method

        Vehicle vehicle2 = new Vehicle("Bob", "Car");
        vehicle2.displayVehicleDetails();
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------------------------------------------"); // just for gap
    }
}
