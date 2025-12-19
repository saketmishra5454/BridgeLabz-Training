import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      // Create Scanner object
        System.out.print("Enter a num: ");
        int number = sc.nextInt();       // Read user input

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
