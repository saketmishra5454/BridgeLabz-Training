package functionalInterface.paymentgateway;

public class PaymentDemo {

    public static void main(String[] args) {

        PaymentProcessor p = new UPIPayment();
        p.pay(500);

        // Calling default method
        p.refund(200);
    }
}
