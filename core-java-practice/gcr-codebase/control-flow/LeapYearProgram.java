import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // first checking Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 and above.");
        } else {
            System.out.println("Using multiple if-else:");

            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }

            System.out.println("Using single if condition:");

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }
}
