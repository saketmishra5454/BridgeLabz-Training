import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking weight input in kg
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        // taking height input in cm
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // converting height from cm to meters
        double heightMeter = heightCm / 100;

        // calculating BMI using formula
        double bmi = weight / (heightMeter * heightMeter);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        // displaying result
        System.out.println("\nYour BMI is: " + bmi);
        System.out.println("Weight Status: " + status);

    }
}
