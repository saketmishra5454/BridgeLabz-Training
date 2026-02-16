package functionalInterface.password_strengthchecker;

import java.util.Scanner;

public class PasswordDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Calling static interface method
        if (SecurityUtils.isStrongPassword(password)) {

            System.out.println("Strong Password");

        } else {
            System.out.println("Weak Password");
        }
        sc.close();
    }
}

