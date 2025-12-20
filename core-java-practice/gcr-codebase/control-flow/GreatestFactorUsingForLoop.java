import java.util.Scanner;

public class GreatestFactorUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // getting input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // default value, in case nothing else works
        int greatestFactor = 1;

        // checking only for valid positive numbers
        if (number <= 1) {
            System.out.println("No valid greatest factor for this number.");
        } else {

            // loop starts from number-1 and goes till 1
            for (int i = number - 1; i >= 1; i--) {

                // if perfectly divisible, this is the greatest factor
                if (number % i == 0) {
                    greatestFactor = i;
                    break; 
                }
            }

            // printing result
            System.out.println("Greatest factor of " + number + " is: " + greatestFactor);
        }
    }
}
