

import java.util.Scanner;

public class RocketLaunchWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        // Take user input
        System.out.print("Enter the countdown number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;           //
        }

        System.out.println("Launch!");

    }
}

    

