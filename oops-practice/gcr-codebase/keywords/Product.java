public class Product {

    // static variable shared by all products
    static double discount = 10.0;   // discount in percentage

    // instance variables
    String productName;
    double price;
    int quantity;

    // final variable 
    final String productID;

    // constructor using this keyword
    public Product(String productID, String productName,
                   double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // method to calculate price after discount
    public double getPriceAfterDiscount() {
        return price - (price * discount / 100);
    }

    // method to display product details
    public void displayProductDetails() {
        
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price after Discount: $" + getPriceAfterDiscount());
    }

    // main method
    public static void main(String[] args) {

        // creating product objects
        Product p1 = new Product("P001", "Laptop", 1200.0, 5);
        Product p2 = new Product("P002", "Smartphone", 800.0, 10);

        // updating discount (shared for all products)
        Product.updateDiscount(10.0);

        // validating using instanceof before processing
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
    }
}
