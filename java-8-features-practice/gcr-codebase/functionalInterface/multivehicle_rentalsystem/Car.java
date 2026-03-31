package functionalInterface.multivehicle_rentalsystem;

public class Car implements VehicleRentalSystem{

    public void rent(){
        System.out.println("Car is Rented");
    }

    public void returnVehicle(){
        System.out.println("Car is Returned");
    }
}
