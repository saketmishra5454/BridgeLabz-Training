import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your initial Smart Card balance: ");
        double balance = scan.nextDouble();
        
        while (balance > 10) { // metro usually needs a minimum balance of 10
            System.out.println("Current Balance: Rs " + balance);
            System.out.print("Enter distance traveled (km) or 0 to exit: ");
            double distance = scan.nextDouble();
            
            if (distance == 0) break;
            
            double fare = (distance <= 5) ? 20.0 : 50.0;
            
            // check if we have enough cash on the card
            if (fare <= balance) {
                balance -= fare; // deduct the fare
                System.out.println("Fare deducted: Rs " + fare);
                System.out.println("Travel successful! Gate opening...");
            } else {
                System.out.println("Insufficient funds! Please recharge your card.");
                break; // stop loop if balance exhausted
            }
        }
        
        System.out.println("Final Balance: Rs " + balance);
        System.out.println("Have a nice day!");
       
    }
}