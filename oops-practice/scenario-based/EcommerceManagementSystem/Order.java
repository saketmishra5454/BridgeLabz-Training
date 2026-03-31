package EcommerceManagementSystem;

public class Order {          //Class used to store Orders from Customer
    int orderId;
    Customer customer;       
    Product product;
    Payment payment;
    public Order(int orderId,Customer customer,Product product,Payment payment){     // Constructor
        this.customer = customer;
        this.payment = payment;
        this.product = product;
        this.orderId = orderId;
    }
    public String getRandomOrderStatus() {                //Method taking order status Randomly
	    String[] statuses = {"Placed", "Delivered", "Canceled"};
	    int index = (int)(Math.random() * statuses.length);
	    return statuses[index];
	}
}
