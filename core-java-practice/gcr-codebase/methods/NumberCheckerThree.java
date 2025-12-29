public class NumberCheckerThree {

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp = temp / 10; // removing last digit
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int temp = number;

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10; // getting last digit
            temp = temp / 10;
        }
        return digits;
    }

    // Method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) { // checking non zero digit
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], power);
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find largest and second largest
    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find smallest and second smallest
    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Main method
    public static void main(String[] args) {

        int number = 153;

        // calling methods
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // duck number check
        if (isDuckNumber(digits)) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is NOT a Duck Number");
        }

        // Armstrong check
        if (isArmstrong(number, digits)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is NOT an Armstrong Number");
        }

        // largest and smallest checks
        findLargest(digits);
        findSmallest(digits);
    }
}
