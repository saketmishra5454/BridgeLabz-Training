import java.util.Scanner;

public class UnitConverterYardFeetInches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input yards
        System.out.println("Enter yards to convert into feet");
        double yards = sc.nextDouble();
        // calling convertYardsToFeet() to convert yards to feet
        double yards2feet = convertYardsToFeet(yards);
        System.out.println("Yards into feet is :" + yards2feet);

        // get input feet
        System.out.println("Enter feet to convert into yards");
        double feet = sc.nextDouble();
        // calling convertFeetToYards() to convert feet to yards
        double feet2yards = convertFeetToYards(feet);
        System.out.println("Feet into yards is :" + feet2yards);

        // get input meters
        System.out.println("Enter meters to convert into inches");
        double meters = sc.nextDouble();
        // calling convertMetersToInches() to convert meters to inches
        double meters2inches = convertMetersToInches(meters);
        System.out.println("Meters into inches is :" + meters2inches);

        // get input inches
        System.out.println("Enter inches to convert into meters");
        double inches = sc.nextDouble();
        // calling convertInchesToMeters() to convert inches to meters
        double inches2meters = convertInchesToMeters(inches);
        System.out.println("Inches into meters is :" + inches2meters);

        // get input inches
        System.out.println("Enter inches to convert into centimeters");
        double inchValue = sc.nextDouble();
        // calling convertInchesToCentimeters() to convert inches to centimeters
        double inches2cm = convertInchesToCentimeters(inchValue);
        System.out.println("Inches into centimeters is :" + inches2cm);

        sc.close();
    }

    // converting yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards2feet * yards;
    }

    // converting feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet2yards * feet;
    }

    // converting meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters2inches * meters;
    }

    // converting inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches2meters * inches;
    }

    // converting inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches2cm * inches;
    }
}
