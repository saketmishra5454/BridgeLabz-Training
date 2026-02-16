package functionalInterface.paymentgateway;

// UPI payment class
class UPIPayment implements PaymentProcessor {

    public void pay(double amount) {

        System.out.println("Paid Rs." + amount +
                " using UPI");
    }
}
