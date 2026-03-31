import java.util.Scanner;

public class BMICalculatorForPeople {

    // Method to calculate BMI and store it in 3rd column
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];     // weight in kg
            double heightCm = data[i][1];   // height in cm

          
            double heightMeter = heightCm / 100;

           
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi; // storing BMI in 3rd column
        }
    }

    // Method to determine BMI status for each person
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            // BMI status logic
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns
        // column 0 -> weight, column 1 -> height, column 2 -> BMI
        double[][] bmiData = new double[10][3];

        // Taking input for weight and height
        for (int i = 0; i < bmiData.length; i++) {

            System.out.println("Enter details of person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            bmiData[i][0] = sc.nextDouble();

            System.out.print("Enter height (in cm): ");
            bmiData[i][1] = sc.nextDouble();

            System.out.println(); // small gap
        }

        // Calculate BMI for all persons
        calculateBMI(bmiData);

        // Get BMI status for all persons
        String[] bmiStatus = getBMIStatus(bmiData);

        // Displaying results
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    bmiData[i][0],
                    bmiData[i][1],
                    bmiData[i][2],
                    bmiStatus[i]);
        }

        sc.close(); 
    }
}

