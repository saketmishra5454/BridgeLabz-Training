import java.util.Scanner;

public class PerfectNumberchecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input number
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // calling methods and displaying results
        System.out.println("Is Perfect Number : " + isPerfect(number));
        System.out.println("Is Abundant Number : " + isAbundant(number));
        System.out.println("Is Deficient Number : " + isDeficient(number));
        System.out.println("Is Strong Number : " + isStrong(number));

        sc.close();
    }

    // method to check perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // method to check abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // method to check deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // method to check strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }
        return sum == number;
    }

    // method to find factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
