import java.util.Scanner;

public class PrintEvenOddOneTOGivenNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     // Create Scanner object
        System.out.print("Enter a number: ");
        int number = sc.nextInt();            // Read user input

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
    }
}
