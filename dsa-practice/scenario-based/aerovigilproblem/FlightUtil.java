package aerovigilproblem;

 //This class contains all validation and calculation methods

public class FlightUtil {

    // Validate Flight Number
    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException {

        // Check format: FL-XXXX
        if (!flightNumber.matches("FL-[0-9]{4}")) {
            throw new InvalidFlightException(
                    "The flight number " + flightNumber + " is invalid");
        }
        // Extract numeric part
        int number = Integer.parseInt(flightNumber.substring(3));

        // Check range
        if (number < 1000 || number > 9999) {
            throw new InvalidFlightException(
                    "The flight number " + flightNumber + " is invalid");
        }
        return true;
    }
    // Validate Flight Name
    public boolean validateFlightName(String flightName)
            throws InvalidFlightException {

        if (flightName.equalsIgnoreCase("SpiceJet") ||
                flightName.equalsIgnoreCase("Vistara") ||
                flightName.equalsIgnoreCase("IndiGo") ||
                flightName.equalsIgnoreCase("Air Arabia")) {

            return true;
        }
        else {
            throw new InvalidFlightException(
                    "The flight name " + flightName + " is invalid");
        }
    }
    // Validate Passenger Count
    public boolean validatePassengerCount(int passengerCount,
                                          String flightName)
            throws InvalidFlightException {

        int maxCapacity = 0;

        // Set capacity
        if (flightName.equals("SpiceJet")) {
            maxCapacity = 396;
        }
        else if (flightName.equals("Vistara")) {
            maxCapacity = 615;
        }
        else if (flightName.equals("IndiGo")) {
            maxCapacity = 230;
        }
        else if (flightName.equals("Air Arabia")) {
            maxCapacity = 130;
        }
        // Check validity
        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount +
                            " is invalid for " + flightName);
        }
        return true;
    }
    // Calculate Fuel Required
    public double calculateFuelToFillTank(String flightName,
                                          double currentFuel)
            throws InvalidFlightException {

        double maxFuel = 0;

        // Set fuel capacity
        if (flightName.equals("SpiceJet")) {
            maxFuel = 200000;
        }
        else if (flightName.equals("Vistara")) {
            maxFuel = 300000;
        }
        else if (flightName.equals("IndiGo")) {
            maxFuel = 250000;
        }
        else if (flightName.equals("Air Arabia")) {
            maxFuel = 150000;
        }
        // Validate fuel level
        if (currentFuel < 0 || currentFuel > maxFuel) {
            throw new InvalidFlightException(
                    "Invalid fuel level for " + flightName);
        }
        // Calculate remaining fuel
        double requiredFuel = maxFuel - currentFuel;

        return requiredFuel;
    }
}
