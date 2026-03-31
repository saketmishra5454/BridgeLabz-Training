import java.util.Scanner;

public class ToggleCaseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input string... just a moment
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // function call to toggle case
        String result = toggleCase(input);

        System.out.println("String after toggling case: " + result);

        sc.close(); // scanner work finished
    }

    public static String toggleCase(String str) {

        String toggled = "";

        // looping through characters... one by one
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // checking uppercase, converting to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                toggled = toggled + (char)(ch + 32);
            }
            // checking lowercase, converting to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                toggled = toggled + (char)(ch - 32);
            }
            // other characters remain same
            else {
                toggled = toggled + ch;
            }
        }

        return toggled; 
    }
}
