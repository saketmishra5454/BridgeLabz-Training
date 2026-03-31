package annotations.max_length;

import java.util.Scanner;

public class MaxLengthDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking username from user
            System.out.print("Enter username: ");
            String name = sc.nextLine();

            // Creating User object
            User u = new User(name);

            // If no exception
            System.out.println("User created successfully!");
            System.out.println("Username: " + u.getUsername());

        } catch (IllegalArgumentException e) {

            // If length is more than allowed
            System.out.println(e.getMessage());

        } catch (Exception e) {

            // Other reflection errors
            System.out.println("Some error occurred");
        }

        sc.close();
    }
}
