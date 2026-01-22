// Dynamic Online Marketplace (student style code)

import java.util.ArrayList;
import java.util.List;

// category interfaces for type restrictions
interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}

// generic product class with bounded type T
class Product<T> {
    private String name;
    private double price;
    private T category; // category type

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name; //name only
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice; // update price
    }

    public T getCategory() {
        return category; // category type data
    }

    @Override
    public String toString() {
        return name + " - $" + price; // simple print only
    }
}

// some category marker classes
class Novel implements BookCategory {}
class Textbook implements BookCategory {}

class Shirt implements ClothingCategory {}
class Jeans implements ClothingCategory {}

class Smartphone implements GadgetCategory {}
class Laptop implements GadgetCategory {}

// catalog class to store products (any type)
class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> p) {
        products.add(p);
    }

    public List<Product<?>> getProducts() {
        return products; // list of mixed types
    }
}

// utility for discounts
class DiscountUtil {
    
    // generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        // applying percentage discount small inaccurate comment
        double oldPrice = product.getPrice();
        double discountAmount = oldPrice * (percentage / 100.0);
        product.setPrice(oldPrice - discountAmount);
    }
}

public class MarketplaceSystem {
    public static void main(String[] args) {

        // creating catalog instance
        Catalog catalog = new Catalog();

        // making book products
        Product<BookCategory> book1 = new Product<>("Java Programming", 45.0, new Textbook());
        Product<BookCategory> book2 = new Product<>("Mystery Novel", 20.0, new Novel());

        // making clothing products
        Product<ClothingCategory> cloth1 = new Product<>("Casual Shirt", 30.0, new Shirt());
        Product<ClothingCategory> cloth2 = new Product<>("Denim Jeans", 55.0, new Jeans());

        // making gadget products
        Product<GadgetCategory> gadget1 = new Product<>("Laptop Pro", 900.0, new Laptop());
        Product<GadgetCategory> gadget2 = new Product<>("Smartphone X", 700.0, new Smartphone());

        // adding all to catalog
        catalog.addProduct(book1);
        catalog.addProduct(book2);
        catalog.addProduct(cloth1);
        catalog.addProduct(cloth2);
        catalog.addProduct(gadget1);
        catalog.addProduct(gadget2);

        // applying discounts on a few items
        DiscountUtil.applyDiscount(book1, 10);   // 10% off textbook
        DiscountUtil.applyDiscount(gadget2, 5);  // 5% off smartphone

        // showing final listing
        System.out.println("=== Product Catalog After Discounts ===");
        for (Product<?> p : catalog.getProducts()) {
            System.out.println(p); // prints simple details
        }
    }
}

