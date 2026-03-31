import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input number
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // calling methods and displaying results
        System.out.println("Is Prime Number : " + isPrime(number));
        System.out.println("Is Neon Number : " + isNeon(number));
        System.out.println("Is Spy Number : " + isSpy(number));
        System.out.println("Is Automorphic Number : " + isAutomorphic(number));
        System.out.println("Is Buzz Number : " + isBuzz(number));

        sc.close();
    }

    // method to check prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to check neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == number;
    }

    // method to check spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    // method to check automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square = square / 10;
            temp = temp / 10;
        }
        return true;
    }

    // method to check buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }
}
