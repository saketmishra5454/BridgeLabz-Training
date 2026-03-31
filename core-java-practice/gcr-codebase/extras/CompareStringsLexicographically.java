import java.util.Scanner;

public class CompareStringsLexicographically {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking first string... wait a sec
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // function call to compare strings
        int result = compareStrings(str1, str2);

        // checking returned value... deciding output
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }

        sc.close(); // input done
    }

    public static int compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        // comparing characters... one by one
        for (int i = 0; i < minLength; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // if characters are not same... decision here
            if (c1 < c2) {
                return -1; // first string comes before
            } else if (c1 > c2) {
                return 1;  // first string comes after
            }
        }

        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        } else {
            return 0; 
        }
    }
}

