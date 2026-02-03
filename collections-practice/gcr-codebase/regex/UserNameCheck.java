package regex;

import java.util.Scanner;

public class UserNameCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter username: ");
        String name = sc.nextLine();
        // Regex for username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        // Checking
        if (name.matches(regex)) {
            System.out.println("Valid Username");

        } else {
            System.out.println("Invalid Username");
        }
        sc.close();
    }
}
