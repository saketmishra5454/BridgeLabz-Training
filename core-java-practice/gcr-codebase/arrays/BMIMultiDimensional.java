import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of persons
        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        // 2D array to store weight, height and BMI
        // index 0 -> weight, 1 -> height, 2 -> BMI
        double[][] personData = new double[number][3];
        // array to store weight status
        String[] weightStatus = new String[number];

        // taking input for each person
        for (int i = 0; i < number; i++) {

            // weight input with validation
            do {
                System.out.println("\nEnter weight (kg) of person " + (i + 1) + ":");
                personData[i][0] = sc.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive, enter again.");
                }
            } while (personData[i][0] <= 0);

            // height input with validation
            do {
                System.out.println("Enter height (meters) of person " + (i + 1) + ":");
                personData[i][1] = sc.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive, enter again.");
                }
            } while (personData[i][1] <= 0);
        }

        // calculating BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][0] / (personData[i][1] * personData[i][1]);

            // deciding weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // displaying result
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }
    }
}
