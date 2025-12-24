import java.util.Scanner;

public class MayaBMITracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maya's Client Fitness Tracker");
        System.out.println("-----------------------------");
        
        // get client details
        System.out.print("Enter client weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter client height in meters (e.g., 1.75): ");
        double height = input.nextDouble();
        
        // Formula: BMI = weight / (height^2)

        double bmi = weight / (height * height);
        
        // Print the result rounded to 2 decimal places
        System.out.printf("The calculated BMI is: %.2f\n", bmi);
        
        // logic for the fitness category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
            System.out.println("Note: Maya suggests a high-protein diet.");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal weight");
            System.out.println("Keep it up! Healthy livin!");
        } 
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Category: Overweight");
            System.out.println("Maya recommends adding more cardio to the routine.");
        } 
        else {
            System.out.println("Category: Obese");
            System.out.println("Please consult with Maya for a custom workout plan.");
        }
    
    }
}