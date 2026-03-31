import java.util.Scanner;

public class FindingYoungestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking age inputs
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // taking height inputs
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // finding youngest friend
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }

        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // finding tallest friend
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }

        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // final output
        System.out.println("\nYoungest friend is: " + youngestFriend);
        System.out.println("Tallest friend is: " + tallestFriend);
    }
}
