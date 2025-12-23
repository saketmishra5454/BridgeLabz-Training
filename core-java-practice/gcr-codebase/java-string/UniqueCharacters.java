import java.util.Scanner;

public class UniqueCharacters {

    // method to find length of string without using length()
    public static int findLength(String text) {

        int count = 0;

        // counting characters manually
        for (;;) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;   // when index out of bound comes
            }
        }
        return count;
    }

    // method to find unique characters using charAt()
    public static char[] findUniqueChars(String text) {

        int len = findLength(text);

        // array to store possible unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

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

            // if unique then store
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // calling unique char method
        char[] uniqueChars = findUniqueChars(input);

        // displaying result
        System.out.println("\nUnique characters are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
