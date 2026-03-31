import java.util.Scanner;

public class CollinearPoints {
   // Method 1: Check collinearity using slope comparison
    static boolean checkCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }
    // Method 2: Check collinearity using area of triangle
    static boolean checkCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read first point
        System.out.print("Enter coordinates x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        // Read second point
        System.out.print("Enter coordinates x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        // Read third point
        System.out.print("Enter coordinates x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
          // Check collinearity using slope method
        boolean slopeMethod = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
         // Check collinearity using area method
        boolean areaMethod = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope: " + slopeMethod);
        System.out.println("Collinear by Area: " + areaMethod);
    }
}