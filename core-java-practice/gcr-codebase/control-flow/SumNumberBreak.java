
import java.util.Scanner;

public class SumNumberBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     // Create Scanner object

        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number : ");
            double number = sc.nextDouble();
            
            if (number <= 0) {    // Check for non-positive number
                break;
            }
            total += number;
        }
        System.out.println("The total sum is " + total);
    }
}

    

