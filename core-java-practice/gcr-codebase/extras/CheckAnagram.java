import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking first string... wait a moment
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // taking second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // function call to check anagram
        boolean result = isAnagram(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are NOT anagrams of each other.");
        }

        sc.close(); // input done
    }

    public static boolean isAnagram(String s1, String s2) {

        // removing spaces and converting to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // if lengths differ... no chance
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256]; // for ASCII characters

        // counting characters of first string
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }

        // checking if all counts are zero
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false; // mismatch found
            }
        }

        return true;
    }
}

