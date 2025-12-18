import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: unit price of the item
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();
        // Input: quantity to be bought
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;
        // Output the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice
        );
    }
}
