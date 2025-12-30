class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        String reverse = "";

        for (int i = cleanText.length() - 1; i >= 0; i--) {
            reverse += cleanText.charAt(i);
        }

        return cleanText.equals(reverse);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 =
                new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker p2 =
                new PalindromeChecker("Hello");

        p1.displayResult();
        p2.displayResult();
    }
}
