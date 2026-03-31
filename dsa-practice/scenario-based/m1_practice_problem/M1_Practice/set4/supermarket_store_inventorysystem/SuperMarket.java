package collections.M1_Practice.set4.supermarket_store_inventorysystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{
	
	String name;
	double price ;
	int quantity;
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

}


class Electronics extends Product{
	int warranty;
	
	public Electronics(String name, double price, int quantity, int warranty) {
		super(name,price,quantity);
		this.warranty = warranty;
	}
	
	//public void addProduct(String name, double)
	
	
}


class Clothing extends Product{
	
	String size;
	
	public Clothing(String name, double price, int quantity, String size) {
		super(name,price,quantity);
		this.size = size;
	}
	
	
}
public class SuperMarket {
	
	 List<Product> products;
	 
	 public SuperMarket() {
		 products = new ArrayList<>();
	 }
	public void addProduct(Product prod) {

		
		if(!products.contains(prod)) {
			products.add(prod);
		}
		
		
		System.out.println("Product added to inventory: " +prod.name);
		
	}
	
	
	public void display() {
		System.out.println("Inventory:");
		
		for(Product p : products) {
			System.out.print(p.name+ " - Price:" + p.price + ", Quantity: "+p.quantity );
			if(p instanceof Electronics) {
				Electronics pr = (Electronics) p;
				System.out.println(", Warranty : "+pr.warranty);
			}
			if(p instanceof Clothing) {
				Clothing pr = (Clothing) p;
				System.out.println(", Size: "+pr.size);
			}
		}
	}
	
	public void totalValue() {
		int total = 0;
		for(Product p : products) {
			
			total += p.quantity *p.price;
		}
		System.out.println("Total value of the inventory: "+ total);
	}
	
	
	
	public static void main(String[] args) {
		
		SuperMarket sm = new SuperMarket();
		
	
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0;  i<n;i++) {
		String input = sc.nextLine();
		
		String[] data = input.split(", ");
		
		
	
		if(data[0].equals("Electronics")) {
		     sm.addProduct(new Electronics(data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]),
		    		 Integer.parseInt(data[4])));
		
		}
		
		else {
			sm.addProduct(new Clothing(data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]),
		    		 data[4]));
		}
		
		}
		sm.display();
		
		sm.totalValue();

}
}


