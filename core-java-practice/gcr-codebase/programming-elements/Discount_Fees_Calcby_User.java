import java.util.*;
public class Discount_Fees_Calcby_User {
      public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int fee = sc.nextInt();        // Original fee input by user
      
       int discount_percent = sc.nextInt();          // Discount percentage input by user

       double discount = fee*(discount_percent/100.0); // Calculate discount amount
       double total_fee = fee-discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + total_fee);
    }
}