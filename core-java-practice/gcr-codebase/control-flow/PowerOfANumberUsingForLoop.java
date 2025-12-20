import java.util.Scanner;

public class PowerOfANumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();                 // base number

        System.out.print("Enter the power: ");
        int power = sc.nextInt();                // exponent

        // checking for valid positive integers
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {

            int result = 1; // starting with 1

            // loop runs power number of times
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            // displaying final answer
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
