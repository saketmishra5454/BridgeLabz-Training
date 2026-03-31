import java.util.Scanner;
public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend and divisor to find quotient and remainder:");
        int dividend = sc.nextInt();                // Input dividend
        int divisor = sc.nextInt();              // Input divisor
        RemainderAndQuotient obj = new RemainderAndQuotient();                 // Create object of the class
        obj.calculateRemainderAndQuotient(dividend, divisor);             // Method call to calculate remainder and quotient

    }
    public void calculateRemainderAndQuotient(int dividend, int divisor) {       // Method to calculate remainder and quotient
        int quotient = dividend / divisor;        // Calculate quotient
        int remainder = dividend % divisor;       // Calculate remainder

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
