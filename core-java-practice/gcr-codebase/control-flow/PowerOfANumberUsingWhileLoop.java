import java.util.Scanner;

public class PowerOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.print("Enter the number: ");          // base number
        int number = sc.nextInt();

        System.out.print("Enter the power: ");        // exponent
        int power = sc.nextInt();

        // checking for valid positive integers
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {

            int result = 1;            // starting with 1

            int i = 1;
            while(i <= power) {
                result = result * number;  
                i++;
            }

            // displaying final answer
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        
    }
}
