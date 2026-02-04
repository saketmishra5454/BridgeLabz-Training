package flipkey;

import java.util.Scanner;

public class FlipKey {

    // Method to generate key
    public static String CleanseAndInvert(String input) {

        // Step 1: Check null and length
        if (input == null || input.length() < 6) {

            // Invalid input
            return "";
        }
        // Step 2: Check for space, digit or special character
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // If not alphabet then invalid
            if (!Character.isLetter(ch)) {

                return "";
            }
        }
        // Step 3: Convert to lowercase
        input = input.toLowerCase();

        String temp = "";

        // Step 4: Remove characters with even ASCII value
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            int ascii = (int) ch;
            // Keep only odd ASCII values
            if (ascii % 2 != 0) {

                temp = temp + ch;
            }
        }
        // Step 5: Reverse the remaining characters
        String reverse = "";
        for (int i = temp.length() - 1; i >= 0; i--) {

            reverse = reverse + temp.charAt(i);
        }

        String result = "";

        // Step 6: Convert even index characters to uppercase
        for (int i = 0; i < reverse.length(); i++) {
            char ch = reverse.charAt(i);

            // Even position (0 based)
            if (i % 2 == 0) {

                result = result + Character.toUpperCase(ch);

            } else {
                result = result + ch;
            }
        }
        // Return final key
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the word");
        String input = sc.nextLine();

        // Calling method
        String key = CleanseAndInvert(input);
        // Checking result
        if (key.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + key);
        }
        sc.close();
    }
}
