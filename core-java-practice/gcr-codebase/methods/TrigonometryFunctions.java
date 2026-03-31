import java.util.*;
public class TrigonometryFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an angle in degrees to calculate its sine, cosine, and tangent:");
        double degrees = sc.nextDouble();                // Input angle in degrees
        TrigonometryFunctions obj = new TrigonometryFunctions();                 // Create object of the class
        obj.calculateTrigonometricFunctions(degrees);             // Method call to calculate trigonometric functions
    }

    public void calculateTrigonometricFunctions(double degrees) {       // Method to calculate sine, cosine, and tangent
        double radians = Math.toRadians(degrees);        // Convert degrees to radians

        double sine = Math.sin(radians);        // Calculate sine
        double cosine = Math.cos(radians);      // Calculate cosine
        double tangent = Math.tan(radians);     // Calculate tangent

        System.out.printf("Sine: %.2f\n", sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
    }   
    
}
