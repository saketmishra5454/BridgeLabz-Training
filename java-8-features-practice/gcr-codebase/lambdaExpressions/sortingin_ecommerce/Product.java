package sortingin_ecommerce;

// Product class to store product details
public class Product {

    String name;
    double price;
    double rating;
    double discount;

    // Constructor
    Product(String name, double price,
            double rating, double discount) {

        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    // Method to display product details
    public void display() {

        System.out.println(name +
                " | Price: " + price +
                " | Rating: " + rating +
                " | Discount: " + discount + "%");
    }
}
