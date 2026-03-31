package exceptionHandling;

import java.util.*;

// User defined exception class
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {

        // Sending message to parent class
        super(msg);
    }
}

public class AgeCheck {

    // Method to check age
    static void validateAge(int age) throws InvalidAgeException {

        // If age is less than 18, throw exception
        if (age < 18) {

            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking age input
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Calling validation method
            validateAge(age);

            // If no error
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {

            // Printing custom message
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
