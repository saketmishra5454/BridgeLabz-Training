package functionalInterface.digital_paymentinterface;

// Wallet payment class
class Wallet implements Payment {

    public void pay(double amount) {

        System.out.println("Payment of Rs." + amount +
                " done using Wallet");
    }
}
