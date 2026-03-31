package collections.restaurant_managementsystem;

import java.util.*;

class MenuItem {

    private String itemName;
    private double price;
    private List<Integer> ratings;

    public MenuItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.ratings = new ArrayList<>();
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public List<Integer> getRatings() {
        return ratings;
    }
}