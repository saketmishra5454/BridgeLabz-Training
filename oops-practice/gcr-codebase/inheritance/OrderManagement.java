
class Order{          //Base Class
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {                // Constructor
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {                    // Method to display order details
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
    String getOrderStatus() {            // Method to get order status
        return "Order Placed";
    }
}

class ShippedOrder extends Order {                //    Derived Class
    int trackingNumber;

    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {            // Constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayOrderDetails() {                    // Overriding method to include tracking number
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);            
    }
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {                    // Multi-level Inheritance
    String deliveryDate;                         

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {             //
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    @Override
    String getOrderStatus() {              // Overriding method to provide delivery status
        return "Order Delivered";
    }
}



public class OrderManagement {
    public static void main(String[] args) {        // Main method to test the classes

        ShippedOrder order2 = new ShippedOrder(124, "2023-10-02", 12346);            
        System.out.println("----- Shipped Order Details -----");   
    
        order2.displayOrderDetails();
        System.out.println(order2.getOrderStatus());
        System.out.println("----- Delivered Order Details -----");
        DeliveredOrder order3 = new DeliveredOrder(124, "2023-10-02", 12346, "2023-10-05");
        order3.displayOrderDetails();
        System.out.println(order3.getOrderStatus());


    }
}
