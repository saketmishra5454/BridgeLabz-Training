// File: Product.javapackage
public class Product {            // Product class to demonstrate constructors and static variable
    String ProductName;
    double price;

    static int totalProducts = 0;

    public Product(String name, double p)           // parameterized constructor
    {
        this.ProductName = name;
        this.price = p;
        totalProducts++;
    }
    public void displayProductDetails()       // method to display product details
    {
        System.out.println("Product Name: " + ProductName);
        System.out.println("Price: " + price);
        System.out.println("Total Products: " + totalProducts);
    }
    public void displayTotalProducts()              // method to display total products created
    {
        System.out.println("Total Products created: " + totalProducts);
    }
    public static void main(String[] args) {            // main method to test the Product class
        Product prod1 = new Product("Laptop", 75000);
        prod1.displayProductDetails();

        System.out.println("----------------------------------------------------------"); // just for gap

        Product prod2 = new Product("Smartphone", 30000);
        prod2.displayProductDetails();
        System.out.println("----------------------------------------------------------"); // just for gap


        Product prod3 = new Product("Tablet", 20000);
        prod3.displayProductDetails();
        System.out.println("----------------------------------------------------------"); // just for gap


        prod3.displayTotalProducts();           // display total products created
          System.out.println("----------------------------------------------------------"); // just for gap

    }

    

    
}
