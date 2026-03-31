import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking two floating-point numbers as input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Printing the results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + number1 + " and " + number2 + " is "+ addition + ", " + subtraction + ", "+ multiplication + ", and "+ division);
    }
}
