import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input of number1 by user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");       // Input of number2 by user
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");      // Input of number3 by user
        int number3 = sc.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);

    }
}
