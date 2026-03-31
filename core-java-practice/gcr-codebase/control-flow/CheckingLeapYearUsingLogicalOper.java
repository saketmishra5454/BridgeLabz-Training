import java.util.Scanner;
public class CheckingLeapYearUsingLogicalOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // leap year checking using logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        sc.close(); 
    }
}
