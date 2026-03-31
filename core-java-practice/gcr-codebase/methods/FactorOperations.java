import java.util.Scanner;

public class FactorOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input number
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // calling method to find factors
        int[] factors = findFactors(number);

        // displaying factors
        System.out.print("Factors are : ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        // calling method to find greatest factor
        int greatestFactor = findGreatestFactor(factors);

        // calling method to find sum of factors
        int sum = findSumOfFactors(factors);

        // calling method to find product of factors
        long product = findProductOfFactors(factors);

        // calling method to find product of cube of factors
        double cubeProduct = findProductOfCubeOfFactors(factors);

        // displaying results
        System.out.println("\n\nGreatest factor : " + greatestFactor);
        System.out.println("Sum of factors : " + sum);
        System.out.println("Product of factors : " + product);
        System.out.println("Product of cube of factors : " + cubeProduct);

        sc.close();
    }

    // method to find factors of a number and return as array
    public static int[] findFactors(int number) {

        int count = 0;

        // first loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // second loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // method to find greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
}
