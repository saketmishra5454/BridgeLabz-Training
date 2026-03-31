import java.util.Scanner;
class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder:");        // Taking input for radius of the cylinder
        double radius = sc.nextDouble();

        System.out.println("Enter height of the cylinder:");         // Taking input for height of the cylinder
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;                           // Calculating volume of the cylinder by using formula 
        System.out.println("Volume of the cylinder is: " + volume);
    }
}