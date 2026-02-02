package lexical_twist;

import java.util.Scanner;

public class LexicalTwist {

    // Method to check vowel
    public static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking first word
        System.out.println("Enter the first word");
        String word1 = sc.nextLine();

        // Taking second word
        System.out.println("Enter the second word");
        String word2 = sc.nextLine();

        // Validation: Check if input has more than one word
        if (word1.contains(" ")) {

            System.out.println(word1 + " is an invalid word");
            return;   // stop program
        }

        if (word2.contains(" ")) {

            System.out.println(word2 + " is an invalid word");
            return;
        }

        // Reverse first word
        String reverse = "";

        for (int i = word1.length() - 1; i >= 0; i--) {

            reverse = reverse + word1.charAt(i);
        }

        // Check if second word is reverse (case insensitive)
        if (reverse.equalsIgnoreCase(word2)) {

            // Step 1: Convert to lowercase
            String result = reverse.toLowerCase();

            String finalWord = "";

            // Step 2: Replace vowels with '@'
            for (int i = 0; i < result.length(); i++) {

                char ch = result.charAt(i);

                if (isVowel(ch)) {

                    finalWord = finalWord + "@";

                } else {

                    finalWord = finalWord + ch;
                }
            }

            // Print transformed word
            System.out.println(finalWord);

        } else {

            // If not reverse case

            // Step 1: Combine words
            String combined = word1 + word2;

            // Step 2: Convert to uppercase
            combined = combined.toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            // Step 3: Count vowels and consonants
            for (int i = 0; i < combined.length(); i++) {

                char ch = combined.charAt(i);

                if (isVowel(ch)) {

                    vowelCount++;

                } else if (ch >= 'A' && ch <= 'Z') {

                    consonantCount++;
                }
            }

            // Step 4: Compare counts

            // If more vowels
            if (vowelCount > consonantCount) {

                String output = "";
                int count = 0;

                // Find first 2 unique vowels
                for (int i = 0; i < combined.length(); i++) {

                    char ch = combined.charAt(i);

                    if (isVowel(ch) && output.indexOf(ch) == -1) {

                        output = output + ch;
                        count++;

                        if (count == 2) {
                            break;
                        }
                    }
                }
                System.out.println(output);
            }
            // If more consonants
            else if (consonantCount > vowelCount) {

                String output = "";
                int count = 0;
                // Find first 2 unique consonants
                for (int i = 0; i < combined.length(); i++) {
                    char ch = combined.charAt(i);
                    if (!isVowel(ch) &&
                            ch >= 'A' && ch <= 'Z' &&
                            output.indexOf(ch) == -1) {

                        output = output + ch;
                        count++;

                        if (count == 2) {
                            break;
                        }
                    }
                }
                System.out.println(output);
            }
            // If equal
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
        sc.close();
    }
}

