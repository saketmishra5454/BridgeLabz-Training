import java.util.Scanner;
public class CheckPosiNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");          // Taking input from user 
        int number = scanner.nextInt();

        if (number > 0) {                 // Checking if the number is positive, negative or zero
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {                    // Checking for negative number
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    
}
