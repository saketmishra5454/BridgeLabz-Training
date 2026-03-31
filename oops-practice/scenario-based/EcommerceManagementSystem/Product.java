package EcommerceManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Product {    //Class name Product used to store Product details
    private int id;
    private String productName;
    String description;
    private int price;
    int quantity;

    private static List<Product> productList = new ArrayList<>();   //List to store products

    public Product(int id, String pn, String d, int price, int q){  //Constructor used to initialize variables
        this.id = id;
        this.productName = pn;
        this.description = d;
        this.price = price;
        this.quantity = q;
        Product.productList.add(this);                // here product is added in the list
    }
    
    private static void removeProduct(Product p){       // Method to remove Item 
        productList.remove(p);
    }
    private static void updateProduct(int index, Product p){   //Update product at specific index
        productList.set(index, p);
    }
    public static void displayProducts(){     //Method used to display all products details 
        for(Product p : productList){
        	System.out.println(
        		    "ID: " + p.getId() +
        		    ", Name: " + p.getProductName() +
        		    ", About: " + p.description +
        		    ", Price: " + p.getPrice() +
        		    ", Quantity: " + p.quantity
        		);
        }

    }
    
    public void display(){     //Method used to display only Single products
        
        	System.out.println(
        		    "ID: " + this.getId() +
        		    ", Name: " + this.getProductName() +
        		    ", About: " + this.description +
        		    ", Price: " + this.getPrice() +
        		    ", Quantity: " + this.quantity
        		);
    }

    
    public int getId(){         // Get method used to get Id
        return id;
    }
    public void setId(int id){      //// Get method used to set Id
        this.id = id;

    }
    public String getProductName(){       //// Get method used to get Product Name
        return productName;
    }
    public void setProductName(String p){
        this.productName = p;
    }
    public int getPrice(){         // Get method used to get price
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

}



