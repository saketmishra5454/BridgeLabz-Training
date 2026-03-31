public class FibonacciComparison {

    // Recursive method (O(2^N))
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method (O(N))
    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int[] testValues = {10, 30, 40}; // WARNING: 40 recursive takes long

        System.out.println("===== Fibonacci Performance Comparison =====\n");

        for (int n : testValues) {
            System.out.println("N = " + n);

            // Recursive Test (for small n)
            if (n <= 40) {
                long startRec = System.currentTimeMillis();
                long recResult = fibonacciRecursive(n);
                long endRec = System.currentTimeMillis();
                System.out.println("Recursive Result: " + recResult + " Time: " + (endRec - startRec) + " ms");
            } else {
                System.out.println("Recursive: Skipped (Too Slow)");
            }

            // Iterative Test
            long startItr = System.currentTimeMillis();
            long itrResult = fibonacciIterative(n);
            long endItr = System.currentTimeMillis();
            System.out.println("Iterative Result: " + itrResult + " Time: " + (endItr - startItr) + " ms\n");
        }
    }
}
