package functionalInterface.smartvehicledashboard;

// Electric car overrides battery method
class ElectricCar implements Vehicle {

    public void displaySpeed() {

        System.out.println("Speed: 60 km/h");
    }

    // Override default method
    public void displayBattery() {

        System.out.println("Battery: 75%");
    }
}
