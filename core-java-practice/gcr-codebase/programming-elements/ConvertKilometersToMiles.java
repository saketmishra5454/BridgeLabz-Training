
import java.util.Scanner;
class ConvertKilometersToMiles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter distance in kilometers:");          
    double kilometer = sc.nextDouble();                 // Taking input for distance in kilometers
	double miles = kilometer * 0.621371;               // Converting kilometers to miles by using conversion factor
    System.out.println(kilometer + " kilometers is equal to " + miles + " miles.");
    }
}

