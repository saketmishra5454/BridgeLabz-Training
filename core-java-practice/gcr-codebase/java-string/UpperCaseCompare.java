import java.util.Scanner;

public class UpperCaseCompare {

    static String manualUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // small logic here
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = manualUpperCase(text);
        String builtIn = text.toUpperCase();

        System.out.println("Result same? " + compareStrings(manual, builtIn));
    }
}
