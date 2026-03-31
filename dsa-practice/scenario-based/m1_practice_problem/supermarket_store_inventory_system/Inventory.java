package collections.supermarket_store_inventory_system;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	List<Product> products;
	
	public Inventory() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		 for(int i=0;i<products.size();i++) {
			 Product p = products.get(i);
			 
			 if(p.equals(product)) {
				 System.out.println("Product already found");
				 return;
			 }
		 }
		 products.add(product);
		 System.out.println("Product added to inventory: "+ product.getName());
	}
	
	public void display() {
		System.out.println("Inventory");
		if(products.isEmpty()) {
			System.out.println("No product is Available");
		}
		for(Product p : products) {
			System.out.println(p);
		}
	}
	
	public void calculateTotalValue() {
		double total = 0;
		for(Product p : products) {
			total+=p.getPrice()* p.getQuantity();
		}
		
		System.out.println("Total value of the inventory: "+ total);
	}
}
