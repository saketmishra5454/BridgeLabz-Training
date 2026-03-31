import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking date input from user
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        // Converting string input to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days to the given date
        LocalDate updatedDate = date.plusDays(7);

        // Adding 1 month to the result
        updatedDate = updatedDate.plusMonths(1);

        // Adding 2 years now
        updatedDate = updatedDate.plusYears(2);

        // Subtracting 3 weeks from final date
        updatedDate = updatedDate.minusWeeks(3);

        // Displaying final calculated date
        System.out.println("Final Date after calculations: " + updatedDate);

        sc.close();
    }
}
