import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingDemo {

    public static void main(String[] args) {

        // Getting the current system date
        LocalDate currentDate = LocalDate.now();

        // Formatter for dd/MM/yyyy pattern
        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatter for yyyy-MM-dd pattern
        DateTimeFormatter formatTwo = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            DateTimeFormatter formatThree =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Formatting the current date using first format
    
        System.out.println("Format 1 (dd/MM/yyyy): "
                + currentDate.format(formatOne));

        // Printing second formatted date

        System.out.println("Format 2 (yyyy-MM-dd): "
                + currentDate.format(formatTwo));

        // Printing third formatted date
        System.out.println("Format 3 (EEE, MMM dd, yyyy): "
                + currentDate.format(formatThree));
    }
}
