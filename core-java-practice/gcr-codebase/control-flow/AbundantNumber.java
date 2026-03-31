import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;            

        // checking only for positive numbers
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            // loop to find all divisors except the number itself
            for (int i = 1; i < number; i++) {

                // if i divides the number perfectly
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            // checking abundant condition
            if (sum > number) {
                System.out.println(number + " is an Abundant Number");
            } else {
                System.out.println(number + " is not an Abundant Number");
            }
        }
    }
}
