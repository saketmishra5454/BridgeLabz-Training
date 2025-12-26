import java.util.Scanner;
public class SpringSeason {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and day to check if it is in Spring Season or Not:");
        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();                 // Input month to check
        System.out.println("Enter day (1-31):");
        int day = sc.nextInt();                          // Input day to check
        SpringSeason obj = new SpringSeason();        // Create object of the class
        boolean isSpring = obj.isInSpringSeason(month, day);         // Method call to check if date is in Spring Season
        if (isSpring) {                       // Check the result and print
            System.out.println("The date " + month + "/" + day + " is in Spring Season.");
        } else {
            System.out.println("The date " + month + "/" + day + " is not in Spring Season.");
        }   

    }

    public boolean isInSpringSeason(int month, int day) {          // Method to check if date is in Spring Season
        if ((month == 3 && day >= 20 && day <= 31)
             || (month == 4 && day >= 1 && day <= 30)
             || (month == 5 && day >= 1 && day <= 31) 
             || (month == 6 && day >= 1 && day <= 20)) {
            return true;                    // Date is in Spring Season
        } else {
            return false;             // Date is not in Spring Season
        }  


    }
}   
    

