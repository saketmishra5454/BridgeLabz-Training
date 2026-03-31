import java.util.Scanner;
public class SideOfSquare {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int perimeterOfSquare= sc.nextInt();                    // perimeter given by user 

       int side = perimeterOfSquare/4;         // calculating side of square in cm

       System.out.println("The length of side is "+ side + " cm" +" whose perimeter is "+ perimeterOfSquare + " cm");

      
    }
}
