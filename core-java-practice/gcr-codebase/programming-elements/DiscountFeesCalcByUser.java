import java.util.*;
public class DiscountFeesCalcByUser {
      public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int fee = sc.nextInt();        // Original fee input by user
      
       int discountPercent = sc.nextInt();          // Discount percentage input by user

       double discount = fee*(discountPercent/100.0); // Calculate discount amount
       double totalFee = fee-discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + totalFee);
    }
}