import java.util.Scanner;
public class CheckPosiNegaOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive, negative, or zero:");
        int numberToCheck = sc.nextInt();                          // Input number to check
        CheckPosiNegaOrZero obj = new CheckPosiNegaOrZero();        // Create object of the class
        int result = obj.checkNumber(numberToCheck);         // Method call to check the number
        if (result == 1) {                       // Check the result and print appropriate message
            System.out.println(numberToCheck + " is Positive");
        } else if (result == -1) {
            System.out.println(numberToCheck + " is Negative");
        } else {
            System.out.println(numberToCheck + " is Zero");
        }
    }

    public int checkNumber(int number) {              // Method to check if number is positive, negative or zero
        if (number > 0) { 
            return 1;
        } else if (number < 0) {                  // Check if number is negative
            return -1;
        } else {
            return 0;
        }
    }
    
}
