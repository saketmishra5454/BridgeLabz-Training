import java.util.Scanner;

public class FactorialRecursive {

    // Function to take input from the user
    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Function to display the result
    static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static void main(String[] args) {
        int number = getInput();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }
    }
}
