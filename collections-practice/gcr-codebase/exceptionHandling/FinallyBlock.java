package exceptionHandling;

import java.util.*;

public class FinallyBlock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking input
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            // Division
            int res = a / b;

            System.out.println("Result: " + res);

        } catch (ArithmeticException e) {

            // If divide by zero
            System.out.println("Cannot divide by zero");

        } finally {

            // This always runs
            System.out.println("Operation completed");
        }

        sc.close();
    }
}

