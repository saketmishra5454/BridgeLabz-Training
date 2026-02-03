package regex;

import java.util.Scanner;

public class CardCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Number: ");     //taking input
        String card = sc.nextLine();

        // Visa or Master
        String regex = "^(4|5)[0-9]{15}$";

        if (card.matches(regex)) {
            System.out.println("Valid Card");
        } else {
            System.out.println("Invalid Card");
        }
        sc.close();
    }
}

