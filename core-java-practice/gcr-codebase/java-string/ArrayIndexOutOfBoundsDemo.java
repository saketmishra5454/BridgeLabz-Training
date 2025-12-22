import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static void generateException(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds handled");
        } catch (RuntimeException e) {
            System.out.println("Some runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // generateException(names);
        handleException(names);
    }
}
