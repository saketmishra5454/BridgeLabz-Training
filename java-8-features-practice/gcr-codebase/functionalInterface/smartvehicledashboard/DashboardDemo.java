package functionalInterface.smartvehicledashboard;

public class DashboardDemo {

    public static void main(String[] args) {

        Vehicle v1 = new Car();

        Vehicle v2 = new ElectricCar();

        System.out.println("Normal Car:");
        v1.displaySpeed();
        v1.displayBattery();

        System.out.println("\nElectric Car:");
        v2.displaySpeed();
        v2.displayBattery();
    }
}
