import java.util.Scanner;

public class HeightOfPlayerFootball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Array to store heights of 11 players
        double heights[] = new double[11];
        double sum = 0.0;
        //input from user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        // Calculate sum of heights
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        // Calculate mean height
        double mean = sum / heights.length;
       
        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}
