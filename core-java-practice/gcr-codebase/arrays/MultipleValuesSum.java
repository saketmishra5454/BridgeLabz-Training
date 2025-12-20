import java.util.Scanner;

public class MultipleValuesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array and variables
        double numbers[] = new double[10];
        double total = 0.0;
        int index = 0;
        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // Break if value is 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array limit reached
            if (index == 10) {
                break;
            }

            // Store value and increment index
            numbers[index] = value;
            index++;
        }
        // Calculate sum and display values
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        // Display total
        System.out.println("Sum of all numbers = " + total);

        sc.close();
    }
}
