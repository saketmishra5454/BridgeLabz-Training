import java.util.Scanner;

class TrimAndCompare {

    // method to find start and end index after trimming spaces
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // remove leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // remove trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // create substring using charAt()
    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String myTrim = createSubstring(input, indexes[0], indexes[1]);

        String builtTrim = input.trim();

        boolean isSame = compareStrings(myTrim, builtTrim);

        System.out.println("\nTrimmed using charAt(): '" + myTrim + "'");
        System.out.println("Trimmed using t
