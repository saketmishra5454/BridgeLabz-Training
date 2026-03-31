import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Scanner for user input
    static Scanner sc = new Scanner(System.in);

    // Random object for generating guesses
    static Random rand = new Random();
    public static void main(String[] args) {

        int low = 1;
        int high = 100;

        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it...");
        System.out.println();



        while (!isCorrect) {

            int guess = generateGuess(low, high);

            System.out.println("My guess is: " + guess);

            String feedback = getUserFeedback();



            if (feedback.equalsIgnoreCase("correct")) {

                System.out.println("Great! I guessed your number correctly.");
                isCorrect = true;

            } 
            else if (feedback.equalsIgnoreCase("high")) {

                high = guess - 1;      // adjusting upper limit

            } 
            else if (feedback.equalsIgnoreCase("low")) {

                low = guess + 1;       // adjusting lower limit

            } 
            else {

                System.out.println("Invalid input. Please type high, low, or correct.");
            }

            System.out.println();
        }

        sc.close();
    }

    // Function to generate a random guess within range
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to receive feedback from user
    public static String getUserFeedback() {
        System.out.print("Is my guess high, low, or correct? : ");
        return sc.nextLine();
    }

}
