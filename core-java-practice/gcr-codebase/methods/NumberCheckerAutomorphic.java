public class NumberCheckerAutomorphic {

    // Method to check prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // prime should be greater than 1
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // divisible by other number
            }
        }
        return true;
    }

    // Method to check neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum = sum + (square % 10); // adding digits of square
            square = square / 10;
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        if (sum == product) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (temp % 10 != square % 10) {
                return false; // digits not matching
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
    }

    // Method to check buzz number
    public static boolean isBuzz(int number) {
        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {

        int number = 7;

        System.out.println("Number: " + number);

        if (isPrime(number)) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("It is NOT a Prime Number");
        }

        if (isNeon(number)) {
            System.out.println("It is a Neon Number");
        } else {
            System.out.println("It is NOT a Neon Number");
        }

        if (isSpy(number)) {
            System.out.println("It is a Spy Number");
        } else {
            System.out.println("It is NOT a Spy Number");
        }

        if (isAutomorphic(number)) {
            System.out.println("It is an Automorphic Number");
        } else {
            System.out.println("It is NOT an Automorphic Number");
        }

        if (isBuzz(number)) {
            System.out.println("It is a Buzz Number");
        } else {
            System.out.println("It is NOT a Buzz Number");
        }
    }
}
