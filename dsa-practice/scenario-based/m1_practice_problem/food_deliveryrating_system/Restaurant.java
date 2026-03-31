package collections.food_deliveryrating_system;

import java.util.*;

class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private List<Integer> ratings;

    public Restaurant(int restaurantId,String restaurantName){
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.ratings = new ArrayList<>();
    }

    public int getRestaurantId(){
        return restaurantId;
    }

    public String getRestaurantName(){
        return restaurantName;
    }

    public List<Integer> getRatings(){
        return ratings;
    }
}
