import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0; // to store digit count
        // special case if number is 0
        if (number == 0) {
            count = 1;
        } else {
            // loop runs until number becomes 0
            while (number != 0) {
                // removing last digit
                number = number / 10;
                // increasing count
                count++;
            }
        }
        // displaying result
        System.out.println("Number of digits: " + count);
    }
}
