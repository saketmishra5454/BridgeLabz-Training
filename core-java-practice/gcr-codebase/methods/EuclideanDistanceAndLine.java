import java.util.Scanner;

public class EuclideanDistanceAndLine {

    
    // This method calculates the distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {

        // Difference between x-coordinates and y-coordinates
        double dx = x2 - x1;
        double dy = y2 - y1;

        // Applying distance formula
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    //This method finds the equation of a straight line
    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (c)
        double yIntercept = y1 - slope * x1;

        // Returning slope and intercept as an array
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner s = new Scanner(System.in);

        // Reading first point coordinates
        System.out.print("Enter x1: ");
        double x1 = s.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = s.nextDouble();

        // Reading second point coordinates
        System.out.print("Enter x2: ");
        double x2 = s.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = s.nextDouble();

        // Calling method to calculate distance
        double distance = findDistance(x1, y1, x2, y2);

        // Calling method to get line equation values
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        // Printing results
        System.out.printf("Euclidean distance: %.4f%n", distance);
        System.out.printf("Equation of line: y = %.4fx + %.4f%n",
              lineEquation[0], lineEquation[1]);

        
        s.close();
    }
}

