import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // taking character to remove
        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = removeCharacter(input, removeChar);        

        System.out.println("Modified String: \"" + result + "\"");

        sc.close();
    }

    public static String removeCharacter(String str, char ch) {

        String modified = "";

        // loop through string
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ch) {
                modified = modified + str.charAt(i); 
            }
            
        }

        return modified; 
    }
}

