import java.util.Scanner;

public class UnitConverterFarhenheitToCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // get input Fahrenheit
        System.out.println("Enter Fahrenheit to convert into Celsius");
        double farhenheit = sc.nextDouble();
        double f2c = convertFarhenheitToCelsius(farhenheit);
        System.out.println("Fahrenheit to Celsius is : " + f2c);

        // get input Celsius
        System.out.println("Enter Celsius to convert into Fahrenheit");
        double celsius = sc.nextDouble();
        double c2f = convertCelsiusToFarhenheit(celsius);
        System.out.println("Celsius to Fahrenheit is : " + c2f);

        // get input pounds
        System.out.println("Enter pounds to convert into kilograms");
        double pounds = sc.nextDouble();
        double p2kg = convertPoundsToKilograms(pounds);
        System.out.println("Pounds to kilograms is : " + p2kg);

        // get input kilograms
        System.out.println("Enter kilograms to convert into pounds");
        double kilograms = sc.nextDouble();
        double kg2p = convertKilogramsToPounds(kilograms);
        System.out.println("Kilograms to pounds is : " + kg2p);

        // get input gallons
        System.out.println("Enter gallons to convert into liters");
        double gallons = sc.nextDouble();
        double g2l = convertGallonsToLiters(gallons);
        System.out.println("Gallons to liters is : " + g2l);

        // get input liters
        System.out.println("Enter liters to convert into gallons");
        double liters = sc.nextDouble();
        double l2g = convertLitersToGallons(liters);
        System.out.println("Liters to gallons is : " + l2g);

        sc.close(); // closing scanner (safe side)
    }

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
