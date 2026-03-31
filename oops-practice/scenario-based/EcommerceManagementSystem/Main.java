package EcommerceManagementSystem;


public class Main{                   //this is the main method
    public static void main(String[] args) {

        // Create sample Products
        Product p1 = new Product(1, "Laptop", "Gaming Laptop", 1500, 10);       
        Product p2 = new Product(2, "Smartphone", "Flagship Model", 800, 20);

        // Create sample Customer
        Customer c1 = new Customer(1, "Saket Mishra", 1234567890, "Mathura");


        // Payment for that order
        Payment pay1 = new Payment(5001, "Done", 1500.00);
       // pay1.completePayment();

       // Create an Order
        Order order1 = new Order(101,c1,p1,pay1);
        Order order2 = new Order(102,c1,p2,new Payment(5002, "Done", 800));


        OrderManagement system1 = new OrderManagement();
        system1.addItem(order1);
        system1.addItem(order2);
        

        // Display orders
        system1.displayOrders();
        //System.out.println(order1);
        //System.out.println(pay1);
    }
}
