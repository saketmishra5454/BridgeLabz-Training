import java.util.Scanner;

public class ReverseAString {
     public static String reverseString(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);          // joining characters slowly
        }

        return reversed; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // asking user for input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // calling reverse function
        String reversedText = reverseString(input);

        System.out.println("Reversed string: " + reversedText);

        sc.close(); 
    }
    
}

