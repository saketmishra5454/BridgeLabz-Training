import java.util.Scanner;

public class FriendsAgeHeightChecker {

    public static String findYoungest(int[] ages, String[] names) {

        int minAge = ages[0];   // assuming first one is youngest for now
        String youngest = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {

        double maxHeight = heights[0]; // assuming first one is tallest
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends (fixed as given)
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for age and height
        for (int i = 0; i < names.length; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();

            System.out.println(); 

        // Calling methods
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        // Displaying results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        sc.close(); 
    }
}

}