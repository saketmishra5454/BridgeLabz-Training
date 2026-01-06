import java.util.Scanner;

public class BusRouteDistanceTracker {          //Main Class

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);         //Scanner for user input

        int totalDistance = 0;
        boolean continueJourney = true;

        while (continueJourney) {          //Loop until passenger decides to get off
            System.out.print("Enter distance to next stop (in km): ");
            int distance = sc.nextInt();         //Input distance to next stop

            totalDistance += distance;        //Update total distance
            System.out.println("Total distance traveled: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();
           // Check if passenger wants to get off
            if (choice.equalsIgnoreCase("yes")) {
                continueJourney = false;
            }
        }

        System.out.println("Passenger got off.");
        System.out.println("Final distance traveled: " + totalDistance + " km");

        sc.close();         //Close the scanner
    }
}
