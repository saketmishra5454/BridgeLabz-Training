public class PalindromeCheck {
    
    // Function to check palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Loop until pointers meet
        while (left < right) {
            // If characters mismatch → not palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            // Move pointers
            left++;
            right--;
        }
        return true; // If loop completes, it's palindrome
    }

    public static void main(String[] args) {
        String input1 = "racecar";
        String input2 = "hello";

        System.out.println(isPalindrome(input1)); // true
        System.out.println(isPalindrome(input2)); // false
    }
}
