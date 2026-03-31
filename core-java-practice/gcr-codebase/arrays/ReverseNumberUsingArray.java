import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking number input from user
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int tempNumber = number;
        int count = 0;
        // finding count of digits
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }
        int[] digits = new int[count];

        tempNumber = number;

        // extracting digits and storing in array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        
        int[] reverseDigits = new int[count];

        // reversing the digits array
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - i - 1];
        }

        // displaying reversed number using array
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }
    }
}
