import java.util.Scanner;

public class BMI_CalculationOf {

    // this method calculate bmi and also decide status
    // it return String array with bmi value and status
    public static String[] calculateBMI(double weight, double heightCm) {

        // converting height from cm to meter
        double heightMeter = heightCm / 100;

        // bmi formula
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        // checking bmi range
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // storing bmi upto 2 decimal
        String bmiValue = String.format("%.2f", bmi);

        return new String[]{bmiValue, status};
    }

    // this method takes height and weight array
    // and store height, weight, bmi and status in String array
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            // calling bmi method
            String[] bmiData = calculateBMI(weight, height);

            // storing data in result array
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    // method to display output in table format
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array for weight and height
        // column 0 -> weight, column 1 -> height
        double[][] personData = new double[10][2];

        // taking input from user
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            personData[i][1] = sc.nextDouble();

            System.out.println();
        }

        // processing bmi
        String[][] result = processBMI(personData);

        // displaying final result
        displayResult(result);

        sc.close();
    }
}
