import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to calculate GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    // Function to calculate LCM using GCD
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to take input
    static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        return new int[]{a, b};
    }
    // Function to display results
    static void displayResult(int a, int b, int gcdResult, int lcmResult) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcdResult);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmResult);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int gcdResult = gcd(a, b);
            int lcmResult = lcm(a, b);
            displayResult(a, b, gcdResult, lcmResult);
        }
    }
}
