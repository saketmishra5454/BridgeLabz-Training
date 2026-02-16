package functionalInterface.digital_paymentinterface;

// UPI payment class
public class UPI implements Payment {

    public void pay(double amount) {

        System.out.println("Payment of Rs." + amount +
                " done using UPI");
    }
}

