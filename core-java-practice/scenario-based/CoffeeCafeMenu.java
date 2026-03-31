import java.util.Scanner;

public class CoffeeCafeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Welcome to Ravi's Cafe! ---");
        
        while (true) {
            System.out.println("\nEnter coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit:");
            String choice = sc.next().toLowerCase();
            
            // check if user wants to leave early
            if (choice.equals("exit")) {
                System.out.println("Closing shop for the day. Bye!");
                break;
            }
            
            System.out.print("How many cups? ");
            int qty = sc.nextInt();
            
            double price = 0;
            
            // determine price based on choice
            switch (choice) {
                case "espresso":
                    price = 150.0;
                    break;
                case "latte":
                    price = 200.0;
                    break;
                case "cappuccino":
                    price = 180.0;
                    break;
                default:
                    System.out.println("Sorry, we dont have that on the menu!");
                    continue; // skip the rest and go back to start
            }
            
            double subtotal = price * qty;
            double gst = subtotal * 0.18; // adding 18% GST (standard stuff)
            double finalBill = subtotal + gst;
            
            System.out.println("--- Receipt ---");
            System.out.println("Subtotal: Rs " + subtotal);
            System.out.println("GST (18%): Rs " + gst);
            System.out.println("Total to pay: Rs " + finalBill);
            System.out.println("---------------");
        }
        
    }
}