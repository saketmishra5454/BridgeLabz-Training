import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {           // catch IllegalArgumentException
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("Some runtime exception occurred");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}

