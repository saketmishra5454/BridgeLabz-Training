import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month : ");   // Taking month and day as input from user
        int month = sc.nextInt();
        System.out.println("Enter day : ");    // Taking month and day as input from user
        int day  = sc.nextInt();

        boolean isSpring =
                (month == 3 && day >= 20) ||       // Checking for Spring Season
                (month == 4) ||
                (month == 5) ||            // Checking for Spring Season
                (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

}
