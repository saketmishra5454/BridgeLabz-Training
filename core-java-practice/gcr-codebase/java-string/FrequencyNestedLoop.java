import java.util.Scanner;

public class FrequencyNestedLoop {

    public static String[] findFrequency(String text) {

        // converting string to character array
        char[] chars = text.toCharArray();

        // array to store frequency of each character
        int[] freq = new int[chars.length];

        // initializing frequency array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }

        // nested loop to calculate frequency
        for (int i = 0; i < chars.length; i++) {

            // if character already marked then skip
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {

                // checking duplicate character
                if (chars[i] == chars[j]) {
                    freq[i]++;        // increase count
                    chars[j] = '0';   // mark duplicate
                }
            }
        }

        // counting number of valid characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        // 1D array to store result
        String[] result = new String[count];
        int index = 0;

        // storing character and frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
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
        String[] output = findFrequency(input);

        // displaying result
        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}
