import java.util.Scanner;
public class GreatestFactorUsingWhileLoop {
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
            int i = number-1;
            while (i >= 1) {        //using while loop
              
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // no need to check further
                }
                i--;
            }

            // printing result
            System.out.println("Greatest factor of " + number + " is: " + greatestFactor);
        }
    }
}
