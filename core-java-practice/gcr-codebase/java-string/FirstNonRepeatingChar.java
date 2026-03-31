import java.util.Scanner;

public class FirstNonRepeatingChar {
    // using ascii frequency logic
    public static char findFirstNonRepeating(String text) {
        // array for ascii characters frequency
        int[] freq = new int[256];

        // loop to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch] = freq[ch] + 1;
        }
        // loop again to find first char having freq 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // calling method
        char result = findFirstNonRepeating(input);

        // displaying result
        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
