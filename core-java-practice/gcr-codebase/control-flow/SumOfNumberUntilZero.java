import java.util.Scanner;

public class SumOfNumberUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;      // stores the sum
       
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }
        System.out.println("The total sum is " + total);
    }
}
