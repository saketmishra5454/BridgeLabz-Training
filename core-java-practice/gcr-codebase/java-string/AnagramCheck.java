import java.util.Scanner;

public class AnagramCheck {

    // method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // if lengths are not equal then not anagram
        if (text1.length() != text2.length()) {
            return false;
        }

        // ascii frequency arrays for both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // finding frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            freq1[ch]++;
        }

        // finding frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            freq2[ch]++;
        }

        // comparing both frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        // if all frequency matched
        return true;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // calling anagram method
        boolean result = isAnagram(text1, text2);

        // displaying result
        if (result) {
            System.out.println("\nThe given texts are Anagrams.");
        } else {
            System.out.println("\nThe given texts are NOT Anagrams.");
        }

        sc.close();
    }
}
