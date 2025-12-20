import java.util.Scanner;

public class YoungestAndTallestFriends {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // names of friends stored seperately
        String[] names = {"Amar", "Akbar", "Anthony"};

        // array to store age of 3 friends
        int[] age = new int[3];

        // array to store height of 3 friends
        int[] height = new int[3];

        // taking input from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            height[i] = sc.nextInt();
        }

        // assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            // checking for youngest age
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            // checking for tallest height
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // final output
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                           " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                           " (Height: " + height[tallestIndex] + ")");

        sc.close(); // closing scanner, not very important but good practice
    }
}
