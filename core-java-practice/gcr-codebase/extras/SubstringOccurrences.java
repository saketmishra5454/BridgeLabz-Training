import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking main string... wait a bit
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        // taking substring
        System.out.print("Enter the substring to search: ");
        String subStr = sc.nextLine();

        // function call
        int count = countOccurrences(mainStr, subStr);

        System.out.println("Substring occurs " + count + " times.");

        sc.close(); 

    public static int countOccurrences(String mainStr, String subStr) {

        int count = 0;

        // loop until remaining length is smaller
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {

            // extracting part of string... checking match
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) {
                count++; 
            }
        }

        return count; 
    }
}
