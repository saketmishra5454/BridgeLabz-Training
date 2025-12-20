import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // checking valid condition
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            // loop running backwards as mentioned
            for (int i = 100; i >= 1; i--) {

                // checking if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
