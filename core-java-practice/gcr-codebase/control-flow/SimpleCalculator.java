import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // taking second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // taking operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // switch case for calculator operations
        switch (op) {

            case "+":             // addition case
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":                    // subtraction case
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":                    // multiplication case
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":                    // division case
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
