package functionalInterface.multivehicle_rentalsystem;

public class Bike implements VehicleRentalSystem {

    public void rent(){
        System.out.println("Bike is Rented");
    }

    public void returnVehicle(){
        System.out.println("Bike is Returned");
    }
}
