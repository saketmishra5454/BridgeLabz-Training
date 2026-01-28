class Solution {
    public int fib(int n) {

        // base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev1 = 0;  // fib(0)
        int prev2 = 1;  // fib(1)
        int current = 0;

        // calculating fibonacci using loop
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}

public class FibonacciNumber
 {

    // method to find fibonacci number
    public static int fib(int n) {

        // base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0; // fib(0)
        int b = 1; // fib(1)
        int c = 0;

        // loop to calculate fibonacci
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    // main method
    public static void main(String[] args) {

        int n = 7; // change value to test

        int result = fib(n);

        System.out.println("Fibonacci number of " + n + " is: " + result);
    }
}
