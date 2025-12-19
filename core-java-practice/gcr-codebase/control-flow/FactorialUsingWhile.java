import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     // Create Scanner object
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num <= 0) {
            System.out.println("Plz enter a positive integer");
        } else {
            int factorial = 1;
            int i = 1;
            // Calculate factorial using while loop
            while (i <= num) {
                factorial = factorial * i;       
                i++;
            }
            // Print the result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
