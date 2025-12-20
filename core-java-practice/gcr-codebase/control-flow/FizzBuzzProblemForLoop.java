import java.util.Scanner;

public class FizzBuzzProblemForLoop{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to count up to: ");
        // Check if the input is actually an integer
        if (reader.hasNextInt()) {
            int limit = reader.nextInt();

            // Make sure it's a positive integer
            if (limit <= 0) {
                System.out.println("Plz enter a number greater than 0.");
            } else {
                System.out.println("we go...");
                
                //FizzBuzz loop
                for (int i = 1; i <= limit; i++) {          // Start from 1 to limit
                
                    if (i % 3 == 0 && i % 5 == 0) {           // Check for multiples of both 3 and 5 first
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("This is not even a number Try running it again with an integer.");
        }

        reader.close();
    }
}