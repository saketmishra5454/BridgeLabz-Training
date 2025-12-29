public class NumberCheckerHarshadNumber {

    // Method to count number of digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp = temp / 10; // removing last digit
        }
        return count;
    }

    // Method to store digits into array
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int temp = number;

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10; // getting digit
            temp = temp / 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + Math.pow(digits[i], 2); // square using Math.pow
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);

        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // digit and its count

        // initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // counting frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        return freq;
    }

    // Main method
    public static void main(String[] args) {

        int number = 21;

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        double squareSum = sumOfSquares(digits);

        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        if (isHarshad(number, digits)) {
            System.out.println("It is a Harshad Number");
        } else {
            System.out.println("It is NOT a Harshad Number");
        }

        int[][] frequency = digitFrequency(digits);

        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "        " + frequency[i][1]);
            }
        }
    }
}
