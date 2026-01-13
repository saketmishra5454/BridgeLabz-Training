package EcommerceManagementSystem;

import java.util.ArrayList;
public class OrderManagement {           //This class manage the Order
	
	public static ArrayList<Order> orders = new ArrayList<>();
	
	
	public void addItem(Order order) {      //Method to order any Item

		if(order.payment.getAmount() < order.product.getPrice() || order.payment.getPaymentStatus().equals("Not Done")) {
			System.out.println("Payment Failed. Cannot place order.");
			return;
		}
		else 
		{
		    Order temp = new Order(order.orderId, order.customer, order.product, order.payment);
		    System.out.println("Order placed successfully!");
		    orders.add(temp);
		}
	}
	public void cancelItem(int orderId) {           //Method to cancel the Item
		for(Order order : orders) {
			if(order.orderId == orderId) {
				orders.remove(order);
				
			}
		}
	}
	
	public void displayOrders() {                //Method to display the order Details
		System.out.println("Current Orders:");

		for(Order order : orders) {
			
			System.out.println("------Product Details------");
			order.product.display();
			
			System.out.println("------Customer Details------");
			System.out.println(order.customer.toString());               //method used to display Customer Details
			
			System.out.println("------Payment Details------");
			order.payment.displayPaymentDetails();                 ////method used to display Payment Details

			
		
			System.out.println("------Delivery Details------");
			System.out.println(order.getRandomOrderStatus());       ////method used to display Delivery Status

			System.out.println("------End Details------");
			System.out.println("______________________________________________________________");
			System.out.println("______________________________________________________________");


		}
	}
}
