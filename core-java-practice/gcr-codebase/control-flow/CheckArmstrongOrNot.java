import java.util.Scanner;

public class CheckArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;          // storing original value
        int sum = 0;                          // sum of cubes
        int digit;

        // loop runs until originalNumber becomes 0
        while (originalNumber != 0) {

            // getting last digit
            digit = originalNumber % 10;
            // adding cube of digit to sum
            sum = sum + (digit * digit * digit);
            // removing last digit from number
            originalNumber = originalNumber / 10;
        }
        // checking Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
