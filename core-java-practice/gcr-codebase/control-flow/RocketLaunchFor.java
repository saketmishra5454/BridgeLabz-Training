import java.util.Scanner;
public class RocketLaunchFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object
        System.out.print("Enter the countdown number: ");
        // Take user input
        int counter = sc.nextInt();         

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");

    }
    
}
