package functionalInterface.unit_conversiontool;

// Interface with static conversion methods
interface UnitConverter {
    // KM to Miles
    static double kmToMiles(double km) {

        return km * 0.621371;
    }

    // KG to Pounds
    static double kgToLbs(double kg) {

        return kg * 2.20462;
    }
}
