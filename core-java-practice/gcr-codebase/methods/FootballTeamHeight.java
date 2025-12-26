import java.util.Random;

public class FootballTeamHeight {

    // Method to calculate sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i]; // adding each value
        }
        return sum;
    }

    // Method to calculate mean height
    public static double findMean(int[] heights) {
        int total = findSum(heights); // calling sum method
        double mean = (double) total / heights.length;
        return mean;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0]; // assuming first as smallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i]; // updating smallest
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0]; // assuming first as biggest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i]; // updating largest
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11]; // array for 11 players
        Random random = new Random();

        // generating random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // random height
        }

        // displaying all heights
        System.out.println("Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cms");
        }

        // calling methods
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // final output
        System.out.println("\nResults:");
        System.out.println("Total Height: " + sum + " cms");
        System.out.println("Mean Height: " + mean + " cms");
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
    }
}

