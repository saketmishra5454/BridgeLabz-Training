package functionalInterface.smartvehicledashboard;

// Interface for vehicles
interface Vehicle {

    void displaySpeed();

    // Default method for battery
    default void displayBattery() {

        System.out.println("Battery info not available");
    }
}
