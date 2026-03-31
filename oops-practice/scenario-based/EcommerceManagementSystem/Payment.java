package EcommerceManagementSystem;

public class Payment {          //This is a Payment class
    private double amount;            
    private int transactionId;
    private String paymentStatus;

    public Payment(int tid, String pm, double amt){
        this.transactionId = tid;
        this.paymentStatus = pm;
        this.amount = amt;
    }
     public double getAmount(){
        return amount;
    }
    public void setAmount(double amt){
        this.amount = amt;
    }
    public int getTanscationId(){
        return transactionId;
    }
    public void setTanscationId(int tid){
        this.transactionId = tid;
    }
    public String getPaymentStatus(){
        return paymentStatus;
    }       
    public void setPaymentStatus(String ps){
        this.paymentStatus = ps;
    }
    public  void displayPaymentDetails(){
        //System.out.println("Payment Details: ");
    	System.out.println("Amount: " + this.getAmount());
        System.out.println("Transaction ID: " + this.getTanscationId());
        System.out.println("Payment Status: " + this.getPaymentStatus());
    }   
}


