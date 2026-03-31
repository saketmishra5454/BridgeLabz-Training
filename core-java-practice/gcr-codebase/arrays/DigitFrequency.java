import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking number input
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // finding count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // array to store digits
        int[] digits = new int[count];
        temp = number;
        // extracting digits and storing in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        // frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // calculating frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // displaying frequency
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
