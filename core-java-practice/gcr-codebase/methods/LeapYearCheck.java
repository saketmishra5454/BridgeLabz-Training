 import java.util.Scanner;

public class LeapYearCheck{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
            return; 
        }
        boolean result = isLeapYear(year);

        // Printing result
        if (result) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;     // leap year confirmed
        }

        return false; 
    }
}

    

