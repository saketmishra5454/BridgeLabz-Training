import java.util.Scanner;

public class OddEvenSeparateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            sc.close();
            return;
        }
        // Create arrays
        int size = number / 2 + 1;
        int[] even = new int[size];
        int[] odd = new int[size];

        // Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        
    }
}
