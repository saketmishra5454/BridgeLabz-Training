package food_delivering_ordersystem;

public class Order {

    private String orderId;
    private String customerName;
    private String deliveryAddress;
    private double orderValue;

    public Order(String customerName, String deliveryAddress, String orderId, double orderValue) {
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.orderId = orderId;
        this.orderValue = orderValue;
    }


    //Getter and Setter

    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

// to string method to print
    @Override
    public String toString(){
        return "OrderId: " + orderId + " Name: "+ customerName + " DeliveryAddress: "+ deliveryAddress + "OrderValue: "+ orderValue;
    }
}
