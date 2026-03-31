import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Double inputs
        System.out.print("Enter value of num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter value of num2: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter value of num3: ");
        double num3 = sc.nextDouble();
        // Performing double operations based on operator precedence
        double result1 = num1 + num2 * num3;
        double result2 = num1 * num2 + num3;
        double result3 = num3 + num1 / num2;
        double result4 = num1 % num2 + num3;
        // Printing the results
        System.out.println(
            "The results of Double Operations are " + result1 + ", "+ result2 + ", "+ result3 + ", and "+ result4);
    }
}
