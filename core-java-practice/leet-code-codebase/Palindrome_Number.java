import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }

        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
