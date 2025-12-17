
import java.util.Scanner;
class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");       // Taking input for base
        int base = sc.nextInt();
        System.out.println("Enter exponent:");         // Taking input for exponent
        int exponent = sc.nextInt();
        int result = (int)Math.pow(base, exponent);            // Calculating power by using Math.pow() method by using type casting
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}