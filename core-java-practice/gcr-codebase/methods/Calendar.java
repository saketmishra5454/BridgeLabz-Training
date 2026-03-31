import java.util.Scanner;

public class Calendar {
    // Array to store month names (index 1 = January, 12 = December)
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
     // Array to store number of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
    //Method to check whether a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getStartDay(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }
//Method to print the calendar for a specific month and year
    public static void printCalendar(int month, int year) {
        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(year, month);
        int days = daysInMonth[month];
        if (month == 2 && isLeapYear(year)) days = 29;

        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if (((i + startDay) % 7 == 0) || (i == days))
                System.out.println();
        }
    }

    public static void main(String[] args) {
         // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
         // Take month input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        // Take year input
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}