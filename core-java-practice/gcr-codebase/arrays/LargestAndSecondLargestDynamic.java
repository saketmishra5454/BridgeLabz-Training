import java.util.Scanner;

public class LargestAndSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking number input
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int maxDigit = 10; // initial array size
        int[] digits = new int[maxDigit];

        int index = 0; // keeps track of position

        // loop until number becomes zero
        while (number != 0) {

            // if array is full, increase size by 10
            if (index == maxDigit) {

                maxDigit = maxDigit + 10; // increasing size

                // create new temp array
                int[] temp = new int[maxDigit];

                // copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // assign temp array back to digits
                digits = temp;
            }

            // extracting last digit
            digits[index] = number % 10;

            // removing last digit
            number = number / 10;

            index++; // move to next index
        }

        int largest = 0;
        int secondLargest = 0;

        // finding largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        // final output
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
