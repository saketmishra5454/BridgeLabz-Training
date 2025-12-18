import java.util.Scanner;

public class Remainder_Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();             // first number input by user
 
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();            // second number input by user

        // Calculate quotient using division operator
        int quotient = num1 / num2;

        // Calculate remainder using modulus operator
        int remainder = num1 % num2;

        // Display the result
        System.out.println(
            "The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2);
    }
}
