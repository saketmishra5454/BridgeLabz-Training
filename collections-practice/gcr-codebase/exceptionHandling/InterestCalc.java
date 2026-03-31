package exceptionHandling;

public class InterestCalc {

    // Method declares exception using throws
    static double calculateInterest(double amt, double rate, int year)
            throws IllegalArgumentException {

        // Checking negative values
        if (amt < 0 || rate < 0) {

            // Throwing exception manually
            throw new IllegalArgumentException();
        }

        // Simple interest formula
        return (amt * rate * year) / 100;
    }

    public static void main(String[] args) {

        try {

            // Calling method
            double result = calculateInterest(10000, 5, 2);

            System.out.println("Interest: " + result);

        } catch (IllegalArgumentException e) {

            // Handling exception here
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
