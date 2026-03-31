import java.util.*;
class AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");       //Taking input for radius of the circle
        double radius = sc.nextDouble();
        //calculating area
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + areaOfCircle);
    }
}