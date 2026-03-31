package functionalInterface.multivehicle_rentalsystem;

import java.util.Scanner;

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {

        VehicleRentalSystem v ;

        Scanner sc = new Scanner(System.in);

        //select the Vehicle
        System.out.println("Select vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");

        int choice = sc.nextInt();


        // Creating object based on user choice
        if (choice == 1) {

            v = new Car();

        } else if (choice == 2) {

            v = new Bike();

        } else if (choice == 3) {

            v = new Bus();

        } else {

            System.out.println("Invalid choice");
            return;
        }

        // Calling interface methods
        v.rent();
        v.returnVehicle();

        sc.close();
    }
}
