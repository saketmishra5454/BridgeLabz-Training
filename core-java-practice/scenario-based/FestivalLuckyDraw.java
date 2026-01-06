import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("Visitor " + i + ", enter your lucky number: ");

            // Check for invalid input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Skipping this visitor.");
                sc.next(); // clear invalid input
                continue;
            }

            int luckyNumber = sc.nextInt();

            // Check divisibility by 3 and 5
            if (luckyNumber % 3 == 0 && luckyNumber % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Sorry, no gift this time.");
            }
        }

        sc.close();
    }
}
