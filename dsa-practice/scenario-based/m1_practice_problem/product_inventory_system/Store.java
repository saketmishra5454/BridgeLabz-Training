package collections.product_inventory_system;

import java.util.*;

class Store {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        // write logic
    	for(Product pro : products) {
    	if(pro.getProductId() == product.getProductId()) {
    		System.out.println("Product is already found");
    		return;
    	}
    	}
    	products.add(product);
    	System.out.println("Product added Successfully");
    	

    }

    public void removeProduct(int productId){
        // write logic
    	Iterator<Product> it = products.iterator();
    	
    	while(it.hasNext()) {
    		Product p = it.next();
    		
    		if(p.getProductId() == productId) {
    			it.remove();
    			System.out.println("Product Removed Successfully");
    		}
    		else {
    		System.out.println("Product not found");
    		}
    		
    	}
    }
  

    public void findProduct(int productId){
        // write logic
    	if(products.isEmpty()) {
    		System.out.println("No Product is Available");
    		return;
    	}
    	
    	for(int i = 0;i<products.size();i++) {
    	
    		Product pro = products.get(i);
    		
    		if(pro.getProductId() == productId) {
    	
    			System.out.println("Product Name: "+ pro.getProductName());
    			System.out.println("Product Price: "+pro.getPrice());
    			return;
    		}
    	}
    	
    	System.out.println("Product not found");
   		
    }
  
 

    public void displayProducts(){
        // write logic
    	
    	for(Product product : products) {
    		System.out.println("ProductId: "+ product.getProductId());
    		System.out.println("Name: "+ product.getProductName());
    		System.out.println("Price: "+product.getPrice());
    		
    		System.out.println("-------------------------------------");
    	}
    }
}