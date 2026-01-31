package collections.VotingSystem;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        // product prices
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Cheese", 100);

        // maintain order user adds items
        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        addToCart(cart, "Milk");
        addToCart(cart, "Cheese");
        addToCart(cart, "Bread");

        System.out.println("Cart in insertion order: " + cart);

        // TreeMap to sort by price
        TreeMap<Integer, String> sortedByPrice = new TreeMap<>();
        for (String item : cart.keySet()) {
            sortedByPrice.put(priceMap.get(item), item);
        }

        System.out.println("Products sorted by price: " + sortedByPrice);
    }

    static void addToCart(LinkedHashMap<String, Integer> cart, String item) {
        cart.put(item, cart.getOrDefault(item, 0) + 1);
    }
}
