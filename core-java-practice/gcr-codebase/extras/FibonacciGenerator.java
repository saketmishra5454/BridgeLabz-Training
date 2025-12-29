
import java.util.Scanner;

public class FibonacciGenerator {
    // Method to generate and print Fibonacci sequence
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            fibonacci(terms);
        }
    }
}

