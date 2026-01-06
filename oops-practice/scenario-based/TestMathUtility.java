class MathUtility {

    // Factorial method
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Prime check method
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // GCD method (Euclidean algorithm)
    public static int gcd(int a, int b) {
        if (a == 0) return Math.abs(b);
        if (b == 0) return Math.abs(a);

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fibonacci method
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
public class TestMathUtility {
    public static void main(String[] args) {
        // Factorial tests
        System.out.println("Factorial(0): " + MathUtility.factorial(0)); // 1
        System.out.println("Factorial(5): " + MathUtility.factorial(5)); // 120

        // Prime tests
        System.out.println("isPrime(1): " + MathUtility.isPrime(1)); // false
        System.out.println("isPrime(2): " + MathUtility.isPrime(2)); // true
        System.out.println("isPrime(29): " + MathUtility.isPrime(29)); // true
        System.out.println("isPrime(30): " + MathUtility.isPrime(30)); // false

        // GCD tests
        System.out.println("GCD(54, 24): " + MathUtility.gcd(54, 24)); // 6
        System.out.println("GCD(0, 5): " + MathUtility.gcd(0, 5)); // 5
        System.out.println("GCD(-48, 18): " + MathUtility.gcd(-48, 18)); // 6

        // Fibonacci tests
        System.out.println("Fibonacci(0): " + MathUtility.fibonacci(0)); // 0
        System.out.println("Fibonacci(1): " + MathUtility.fibonacci(1)); // 1
        System.out.println("Fibonacci(10): " + MathUtility.fibonacci(10)); // 55
    }
}