package functionalInterface.dateformat_utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Interface with static date method
interface DateUtils {

    static String formatDate(String date) {

        // Input format: yyyy-MM-dd
        LocalDate d =
                LocalDate.parse(date);

        // Output format: dd-MM-yyyy
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return d.format(formatter);
    }
}

