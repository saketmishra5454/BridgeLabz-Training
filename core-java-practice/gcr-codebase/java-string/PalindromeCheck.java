import java.util.Scanner;

public class PalindromeCheck {

    // LOGIC 1 : simple loop compare start and end
    public static boolean isPalindromeLogic1(String text) {

        int start = 0;
        int end = text.length() - 1;

        // loop till middle of string
        while (start < end) {

            // compare characters from both sides
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2 : recursive palindrome check
    public static boolean isPalindromeLogic2(String text, int start, int end) {

        // base condition
        if (start >= end) {
            return true;
        }

        // if characters not equal then not palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // recursive call
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    // method to reverse string using charAt()
    public static char[] reverseString(String text) {

        char[] reverse = new char[text.length()];
        int index = 0;
        // reversing string manually
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    // LOGIC 3 : using character arrays
    public static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        // comparing original and reverse arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // calling all three logics
        boolean result1 = isPalindromeLogic1(input);
        boolean result2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean result3 = isPalindromeLogic3(input);

        // displaying result
        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------");

        System.out.println("Logic 1 (Loop Method): " + result1);
        System.out.println("Logic 2 (Recursive Method): " + result2);
        System.out.println("Logic 3 (Array Method): " + result3);

        sc.close();
    }
}
