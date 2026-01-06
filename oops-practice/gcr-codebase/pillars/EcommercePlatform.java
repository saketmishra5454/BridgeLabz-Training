// Interface for tax calculation
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {

    // encapsulated fields
    private int productId;
    private String name;
    private double price;

    // constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // getters and setter (encapsulation)
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // abstract method
    public abstract double calculateDiscount();
}

// Electronics product
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST";
    }
}

// Clothing product
class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST";
    }
}

// Groceries product (no tax interface)
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

// Main class
public class EcommercePlatform {

    // polymorphic method
    public static void printFinalPrice(Product[] products) {

        for (Product p : products) {

            double tax = 0;

            // instanceof check
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice =
                    p.getPrice() + tax - p.calculateDiscount();

            System.out.println("Product Name : " + p.getName());
            System.out.println("Final Price  : " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // list of products (polymorphism)
        Product[] products = {
                new Electronics(1, "Laptop", 60000),
                new Clothing(2, "Jacket", 4000),
                new Groceries(3, "Rice", 1200)
        };

        printFinalPrice(products);
    }
}
