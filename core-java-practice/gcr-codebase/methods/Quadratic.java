import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {

        // calculating delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // if delta is positive → two roots
        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[]{root1, root2};
        }

        // if delta is zero → one root
        else if (delta == 0) {

            double root = -b / (2 * a);
            return new double[]{root};
        }

        // if delta is negative → no real roots
        else {
            return new double[0]; // returning empty array
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calling method to find roots
        double[] roots = findRoots(a, b, c);

        // Displaying results
        if (roots.length == 2) {
            System.out.println("Two real roots found:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("Only one real root found:");
            System.out.println("Root = " + roots[0]);
        } 
        else {
            System.out.println("No real roots found (delta is negative).");
        }

        sc.close(); 
    }
}
