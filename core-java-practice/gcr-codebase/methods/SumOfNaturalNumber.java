import java.util.Scanner;

public class SumOfNaturalNumber{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking whether number is natural or not
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return; // stopping execution here
        }
        // Calling recursive method
        int recursiveSum = sumUsingRecursion(n);
        // Calling formula method
        int formulaSum = sumUsingFormula(n);

        // Displaying results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Comparing both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not matching.");
        }
    }

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {

        // Base condition
        if (n == 1) {
            return 1;
        }

        // Recursive call 
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}

