import java.util.Scanner;
public class HeightCentiToFeet {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int height = sc.nextInt();                    // height input by user in cm
       
       double height_inches = height/2.54;         // cm to inches
       
       int height_feet = (int)height_inches/12;         // calculating height in feet
       double remaining_inches = height_inches%12;      // calculating remaining inches
       
       
       
       System.out.println("Your height in cm is "+ height+ " while in feet is "+ height_feet+ " and inches is "+ remaining_inches);

    }
}
