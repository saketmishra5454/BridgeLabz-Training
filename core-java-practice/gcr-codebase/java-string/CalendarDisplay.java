import java.util.Scanner;

public class CalendarDisplay {

    // method to get month name
    public static String getMonthName(int month) {

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }

    // method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // checking for February and leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // method to find first day of month using Gregorian algorithm
    // 0 = Sunday, 1 = Monday, ...
    public static int getFirstDay(int month, int year) {

        int d = 1;
        int m = month;
        int y = year;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // method to display calendar
    public static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("\n\t" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // first loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // second loop to print days
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // calling calendar method
        displayCalendar(month, year);

        sc.close();
    }
}
