
import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true; // assuming number is prime first

        // prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // checking divisibility from 2 till number-1
            for (int i = 2; i < number; i++) {
                // if divisile by any number, not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // no need to continue checking
                }
            }
        }

        // printing result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
