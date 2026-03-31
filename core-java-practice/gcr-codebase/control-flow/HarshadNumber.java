import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number; // storing original value
        int sum = 0;                 // to store sum of digits
        int digit;

        // loop to get each digit of the number
        while (originalNumber != 0) {
            // getting last digit
            digit = originalNumber % 10;
            // adding digit to sum
            sum = sum + digit;

            // removing last digit
            originalNumber = originalNumber / 10;
        }

        // checking Harshad condition
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
