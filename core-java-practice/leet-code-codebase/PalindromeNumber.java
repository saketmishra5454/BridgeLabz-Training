import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;          // assign the Value of x to the temp
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

        System.out.print("Enter a number: ");      // enter the value of x
        int x = sc.nextInt();

        if (isPalindrome(x)) {                  // checking is Palindrome or not
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
