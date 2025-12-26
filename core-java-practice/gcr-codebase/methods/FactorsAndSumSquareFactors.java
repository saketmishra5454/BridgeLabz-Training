//package core-java-practice.gcr-codebase.methods;

import java.util.Scanner;

public class FactorsAndSumSquareFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);

        // Displaying factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); 

        // Calling other methods
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Printing results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    }
    // Static method to find factors and return them as array
    public static int[] findFactors(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {         // First loop to count factors
            if (num % i == 0) {
                count++;
            }
        }

        // Initializing array with count size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to actually store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++; // move to next position
            }
        }

        return factors; 
    }

    // Method to find sum of factors
    public static int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // adding one by one
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] arr) {

        long product = 1; 

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] arr) {

        double sumSquares = 0;

        for (int i = 0; i < arr.length; i++) {
            sumSquares = sumSquares + Math.pow(arr[i], 2);
        }

        return sumSquares;
    }
}
