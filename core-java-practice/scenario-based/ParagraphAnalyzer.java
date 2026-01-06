import java.util.Scanner;

public class ParagraphAnalyzer {

    // Method to analyze paragraph
    public static void analyzeParagraph(String paragraph, String oldWord, String newWord) {

        // Edge case: empty or only spaces
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("The paragraph is empty or contains only spaces.");
            return;
        }

        // Remove extra spaces and split into words
        String[] words = paragraph.trim().split("\\s+");

        // Count words
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);

        // Find longest word
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);

        // Replace word (case-insensitive)
        String replacedParagraph = paragraph.replaceAll(
                "(?i)\\b" + oldWord + "\\b", newWord);

        System.out.println("Updated paragraph:");
        System.out.println(replacedParagraph);
    }

    // Main method to test
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter replacement word: ");
        String newWord = sc.nextLine();

        analyzeParagraph(paragraph, oldWord, newWord);

        sc.close();
    }
}
