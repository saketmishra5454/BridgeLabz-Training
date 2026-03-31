
import java.util.Scanner;
class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");       // Taking input for length of the rectangle
        double length = sc.nextDouble();
        System.out.println("Enter width of the rectangle:");     // Taking input for width of the rectangle
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);                      // Calculating perimeter of the rectangle by using formula
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}