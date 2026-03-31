package collections.restaurant_managementsystem;

import java.util.*;

class Restaurant {

    private Map<String, MenuItem> menu = new LinkedHashMap<>();

    public void addItem(String name, double price) {
        // Write logic
    	if(!menu.containsKey(name)) {
    		menu.put(name, new MenuItem(name,price));
            System.out.println("Item Added Successfully");
         }
    	else {
    	System.out.println("Item Already Exists");
    	}

    }

    public void removeItem(String name) {
        // Write logic
        MenuItem removedItem = menu.remove(name);

        if(removedItem!=null){
            System.out.println("Item removed Successfully");
        }
        else{
            System.out.println("Item not Removed");
        }
    }

    public void addRating(String name, int rating) {
        // Write logic
    	
    	MenuItem item = menu.get(name);
    	
    	if(item!=null) {
    		item.getRatings().add(rating);
    		System.out.println("Ratings added Successfully");
    	}
    	else {
    		System.out.println("Invalid Item/ Item not found");
    	}
    }

    public void calculateAverageRating(String name) {
        // Write logic
    	MenuItem item = menu.get(name);
    	if(item==null) {
    		System.out.println("Item Name is Invalid/Not Found.");
    		return;
    	}
    	
    	List<Integer> rate = item.getRatings();
    	
    	if(rate.isEmpty()) {
    		System.out.println("No Ratings Yet");
    		return;
    	}
    	double sum = 0;
    	for(int r:rate) {
    		sum+=r;
    	}
    	
    	double avgRatings = sum/rate.size();
    	
    	System.out.println("Average Rating for: "+	name +" : "+ avgRatings);
	
    }

    public void displayMenu() {
        // Write logic
    	if(menu.isEmpty()) {
    		System.out.println("Menu is Empty");
    		return;
    	}
    	
    	for(MenuItem it: menu.values()) {
    		System.out.println("Item: "+it.getItemName()
    		+" | Price :"+ it.getPrice());
    		
    	}
    }
}
