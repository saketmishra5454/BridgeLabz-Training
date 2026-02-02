package exceptionHandling;

import java.util.*;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking input from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Division operation
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // When user enters 0
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {

            // When user enters wrong data
            System.out.println("Please enter numbers only");
        }
        sc.close();
    }
}
