package functionalInterface.digital_paymentinterface;

// Credit card payment class
class CreditCard implements Payment {

    public void pay(double amount) {

        System.out.println("Payment of Rs." + amount +
                " done using Credit Card");
    }
}

