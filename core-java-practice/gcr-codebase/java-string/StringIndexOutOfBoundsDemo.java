import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));                // invalid index
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {                           // catching specific exception
            System.out.println("String index out of bounds handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter string: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
