package aerovigilproblem;

import java.util.Scanner;
 // Main Class for User Interaction
public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object of FlightUtil
        FlightUtil util = new FlightUtil();
        try {
            // Ask user for input
            System.out.println("Enter flight details");

            String input = sc.nextLine();

            // Split input using :
            String[] data = input.split(":");

            // Store values
            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount = Integer.parseInt(data[2]);
            double currentFuel =
                    Double.parseDouble(data[3]);
            // Validate inputs
            util.validateFlightNumber(flightNumber);

            util.validateFlightName(flightName);

            util.validatePassengerCount(passengerCount,
                    flightName);

            // Calculate fuel
            double fuelNeeded =
                    util.calculateFuelToFillTank(flightName,
                            currentFuel);

            // Print result
            System.out.println(
                    "Fuel required to fill the tank: "
                            + fuelNeeded + " liters");
        }
        catch (InvalidFlightException e) {

            // Custom exception message
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            // Other errors
            System.out.println("Invalid input format");
        }
        finally {
            // Close scanner
            sc.close();
        }
    }
}

