package review;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling {

    // Method throwing custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        System.out.println("Program Started...");

        try {
            int age = 15; // Custom exception trigger
            int result = 10 / 0; // Arithmetic exception trigger
            checkAge(age);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException!");
            System.out.println("Message: " + e.getMessage());

        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom review.InvalidAgeException!");
            System.out.println("Message: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught General Exception!");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Program Ended Normally.");
    }
}


