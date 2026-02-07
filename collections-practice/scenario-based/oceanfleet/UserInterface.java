package oceanfleet;

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VesselUtil util = new VesselUtil();
        // Input number of vessels
        System.out.println("Enter the number of vessels to be added");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.println("Enter vessel details");
        // Input vessel details
        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            // Split input
            String[] data = input.split(":");

            String id = data[0];
            String name = data[1];
            double speed = Double.parseDouble(data[2]);
            String type = data[3];

            // Create vessel object
            Vessel v = new Vessel(id, name, speed, type);

            // Add to list
            util.addVesselPerformance(v);
        }
        // Search by ID
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel found = util.getVesselById(searchId);

        if (found != null) {
            System.out.println(found.getVesselId() + " | "
                    + found.getVesselName() + " | "
                    + found.getVesselType() + " | "
                    + found.getAverageSpeed() + " knots");

        } else {

            System.out.println("Vessel Id " + searchId + " not found");
        }
        // Get high performance vessels
        System.out.println("High performance vessels are");
        List<Vessel> highList = util.getHighPerformanceVessels();

        for (Vessel v : highList) {

            System.out.println(v.getVesselId() + " | "
                    + v.getVesselName() + " | "
                    + v.getVesselType() + " | "
                    + v.getAverageSpeed() + " knots");
        }
        sc.close();
    }
}
