import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking first date input
        System.out.print("Enter first date (YYYY-MM-DD): ");
        String firstInput = scanner.nextLine();

        // Taking second date input
        System.out.print("Enter second date (YYYY-MM-DD): ");
        String secondInput = scanner.nextLine();

        // Converting input strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstInput);
        LocalDate secondDate = LocalDate.parse(secondInput);

        // Comparing the two dates
        if (firstDate.isBefore(secondDate)) {

            // First date comes earlier in calendar
            System.out.println("First date is BEFORE the second date.");

        } else if (firstDate.isAfter(secondDate)) {

            // First date is later than second one
            System.out.println("First date is AFTER the second date.");

        } else if (firstDate.isEqual(secondDate)) {

            // Both dates represent same calendar day
            
            System.out.println("Both dates are the SAME.");

        }
        scanner.close();
    }
}
