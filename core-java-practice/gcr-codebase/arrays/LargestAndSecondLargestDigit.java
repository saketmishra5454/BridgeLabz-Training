import java.util.Scanner;

public class LargestAndSecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking number input from user
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int maxDigit = 10; // max size of array
        int[] digits = new int[maxDigit];

        int index = 0; // to track array index

        // extracting digits from number
        while (number != 0) {

            // stop if array size reached
            if (index == maxDigit) {
                break; // remaining digits ignored
            }

            // get last digit
            digits[index] = number % 10;

            // remove last digit from number
            number = number / 10;

            index++; // moving to next index
        }

        int largest = 0;
        int secondLargest = 0;

        // loop through stored digits
        for (int i = 0; i < index; i++) {

            // check for largest digit
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            // check for second largest digit
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        // displaying result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        
    }
}
