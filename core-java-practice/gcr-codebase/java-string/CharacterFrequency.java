import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {

        // ascii frequency array
        int[] freq = new int[256];

        // counting frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch] = freq[ch] + 1;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = 0;  // mark visited
            }
        }


        for (int i = 0; i < 256; i++) {
            freq[i] = 0;
        }
        // recalculate frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // storing characters and frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; // avoid duplicate entry
            }
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
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }

    }
}
