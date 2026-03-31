package functionalInterface.paymentgateway;

// Interface for payment processors
interface PaymentProcessor {

    // Abstract method
    void pay(double amount);

    default void refund(double amount) {

        System.out.println("Refund of Rs." + amount +
                " processed successfully");
    }
}
