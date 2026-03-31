package functionalInterface.digital_paymentinterface;

import java.util.Scanner;

public class PaymentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Payment p = null;

        System.out.println("Select payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Wallet");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Create object based on choice
        if (choice == 1) {

            p = new UPI();

        } else if (choice == 2) {

            p = new CreditCard();

        } else if (choice == 3) {

            p = new Wallet();

        } else {

            System.out.println("Invalid choice");
            return;
        }
        // Call payment method
        p.pay(amount);

        sc.close();
    }
}
