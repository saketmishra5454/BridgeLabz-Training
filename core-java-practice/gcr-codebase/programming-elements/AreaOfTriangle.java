import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        // Taking base and height of the triangle in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double heightInches = sc.nextDouble();

        
        double areaSquareInches = 0.5 * baseInches * heightInches;         // Area calculation in square inches

        // Conversion factors
        double areaSquareCentimeters = areaSquareInches * 6.4516; // 1 sq inch = 6.4516 sq cm
        double areaSquareFeet = areaSquareInches / 144;           // 1 sq foot = 144 sq inches

        // Printing the result
        System.out.println(
            "Your Area in cm is " + areaSquareCentimeters +" while in feet is " + areaSquareFeet +" and inches is " + areaSquareInches);
    }
}
