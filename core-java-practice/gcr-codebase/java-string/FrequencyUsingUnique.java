import java.util.Scanner;

public class FrequencyUsingUnique {
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        // temporary array to store possible unique chars
        char[] temp = new char[len];
        int count = 0;
        // outer loop for each character
        for (int i = 0; i < len; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            // inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // if character is unique then store it
            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        // create array of exact size
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }
    // returns 2D String array
    public static String[][] findFrequency(String text) {

        // ascii frequency array
        int[] freq = new int[256];

        // calculating frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // calling unique character method
        char[] uniqueChars = uniqueCharacters(text);
        // 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        // storing unique characters and their frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // calling frequency method
        String[][] frequencyData = findFrequency(input);

        // displaying result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(
                    frequencyData[i][0] + "\t\t" +
                    frequencyData[i][1]
            );
        }
    }
}
