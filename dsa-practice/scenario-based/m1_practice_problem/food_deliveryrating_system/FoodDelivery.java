package collections.food_deliveryrating_system;


import java.util.*;

class FoodDelivery {

    private Map<Integer,Restaurant> restaurants = new LinkedHashMap<>();

    public void addRestaurant(int id,String name){
        // write logic
    	
    	Restaurant addRest = restaurants.putIfAbsent(id, new Restaurant(id,name));
    	
    	if(addRest == null) {
    		System.out.println("Restaurant Added Successfully");
    	}
    	else {
    		System.out.println("Restaurant Already Exists");
    	}
    }
    
    
    public void removeRestaurant(int id) {
    	
    	Restaurant removedRestaurant = restaurants.remove(id);
    	
    	if(removedRestaurant!=null) {
    		System.out.println("Restaurant removed successfully");
    	}
    	else {
    		System.out.println("Restaurant not found");
    	}
    }
    

    public void addRating(int id,int rating){
        // write logic
    	if(restaurants.isEmpty()) {
    		System.out.println("No Retaurant is Available");
    		return;
    	}
    	
    	
    	Restaurant restaurant = restaurants.get(id);
    	
    	if(restaurant == null) {
    		System.out.println("Restaurant Not Found");
    		return;
    	}
    	
    	else {
    	//if(restaurant.getRestaurantId() == id) {
    		restaurant.getRatings().add(rating);
    		System.out.println("Rating Added Succesfully");
    		return;
    	}
    	
    	
    }

    public void calculateAverageRating(int id){
        // write logic
    	
    	if(restaurants.isEmpty()) {
    		System.out.println("No Retaurant is Available");
    		return;
    	}
    	
    	Restaurant rest = restaurants.get(id);
    	
    	if(rest == null) {
    		System.out.println("No Restaurant found");
    		return;
    	}
    	
    	List<Integer> ratings = rest.getRatings();
    	
    	if(ratings.isEmpty()){
    	    System.out.println("No Ratings Yet");
    	    return;
    	}
    	
    	
    	double sum = 0;
    	for(int i : ratings) {
    		sum+=i;
    	}
    	
    	double avg = sum/ratings.size();
    	
    	System.out.println("The Average Rating of "+ rest.getRestaurantName() +" is: "+ avg);
    	
    }

    public void findTopRatedRestaurant(){
        // write logic
    	if(restaurants.isEmpty()) {
    		System.out.println("No Retaurant is Available");
    		return;
    	}
    	
    	double maxRating = 0;
    	String topRestaurant = null;
    	for(Restaurant restaurant : restaurants.values()) {
    		
    	     List<Integer> ratings = restaurant.getRatings();
    	     
    	     if(ratings.isEmpty()) {
    	    	 continue;
    	     }
    	     
    	     double sum = 0;
    	     for(int i : ratings) {
    	    	 sum+=i;
    	     }
    	     
    	     double average = sum/ratings.size();
    	     
    	     
    	     if(average>maxRating) {
    	    	 maxRating = average;
    	    	 topRestaurant = restaurant.getRestaurantName();
    	     }
    	}
    	
    	     
    	     if(topRestaurant!=null) {
    	    	 System.out.println("The Top Rated Restaurant is: "+ topRestaurant);
    	    	 System.out.println("With Average Ratings: "+ maxRating);
    	     }
    	     
    	     else {
    	    	 System.out.println("Top Rated Restaurant is Not Found");
    	     }
    
    	}
    	
    

    public void displayRestaurants(){
        // write logic
    	
    	if(restaurants.isEmpty()) {
    		System.out.println("No Retaurant is Available");
    		return;
    	}
    	
    	for(Restaurant restaurant : restaurants.values()) {
    		System.out.println("Restaurant Id: "+ restaurant.getRestaurantId());
    		System.out.println("Name: "+ restaurant.getRestaurantName());
    		System.out.println("Rating: "+restaurant.getRatings());
    		System.out.println("-----------------------------------------");
    		
    	}
    }
    
   
}