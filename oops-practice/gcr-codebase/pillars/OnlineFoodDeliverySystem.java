package pillars;
// Interface for discount feature
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {

    // encapsulation: private variables
    private String itemName;
    private double price;
    private int quantity;

    // constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // getters only (no setters to protect data)
    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // abstract method
    public abstract double calculateTotalPrice();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + 50; // extra charge for non veg
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // less discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

// Main class
public class OnlineFoodDeliverySystem {

    // order processing method (polymorphism)
    public static void processOrder(FoodItem item) {

        item.getItemDetails();
        double total = item.calculateTotalPrice();
        System.out.println("Total Price: " + total);

        // interface reference
        Discountable d = (Discountable) item;
        System.out.println(d.getDiscountDetails());
        System.out.println("Discount Amount: " + d.applyDiscount());

        double finalAmount = total - d.applyDiscount();
        System.out.println("Final Amount to Pay: " + finalAmount);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // polymorphism
        FoodItem item1 = new VegItem("Paneer Burger", 120, 2);
        FoodItem item2 = new NonVegItem("Chicken Pizza", 250, 1);

        processOrder(item1);
        processOrder(item2);
    }
}
