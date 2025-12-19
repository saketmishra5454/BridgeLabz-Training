
public class DiscountFeesCalc {
      public static void main(String[] args) {
        
       int fee = 125000;
       int discount_percent = 10;
       double discount = fee*0.1;
       double totalFee = fee-discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + totalFee);
    }
}