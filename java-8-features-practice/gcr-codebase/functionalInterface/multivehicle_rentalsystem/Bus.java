package functionalInterface.multivehicle_rentalsystem;

public class Bus implements VehicleRentalSystem {

    public void rent(){
        System.out.println("Bus is Rented");
    }

    public void returnVehicle(){
        System.out.println("Bus is Returned");
    }
}
