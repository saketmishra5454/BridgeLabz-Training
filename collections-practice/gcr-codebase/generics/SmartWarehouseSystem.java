// Smart Warehouse System (student style code)

import java.util.ArrayList;
import java.util.List;

// base abstract class for items
abstract class WarehouseItem {
    private String name;
    
    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name; // returns name only
    }

    // little blank to be overrided later
    public abstract String getDetails();
}

// --- Electronics class
class Electronics extends WarehouseItem {
    private int powerWatts;

    public Electronics(String name, int powerWatts) {
        super(name);
        this.powerWatts = powerWatts;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + " uses " + powerWatts + "W"; // info
    }
}

// --- Groceries class
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Groceries: " + getName() + " expires on " + expiryDate; // for expiry
    }
}

// --- Furniture class
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture: " + getName() + " made of " + material;
    }
}

// generic storage class with bounded type
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item); // adds stuff
    }

    public List<T> getItems() {
        return items; // return list
    }
}

// utility with wildcard method
class WarehouseDisplay {
    public static void showStorage(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getDetails()); // show details
        }
        // end here
    }
}

public class SmartWarehouseSystem {
    public static void main(String[] args) {

        // making storage for electronics
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop", 65));
        electronicStorage.addItem(new Electronics("TV", 200));

        // for groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Milk", "15-02-2026"));
        groceryStorage.addItem(new Groceries("Bread", "10-01-2026"));

        // for furnitures
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        // displaying with wildcard
        System.out.println("=== Electronics Storage ===");
        WarehouseDisplay.showStorage(electronicStorage.getItems());

        System.out.println("\n=== Groceries Storage ===");
        WarehouseDisplay.showStorage(groceryStorage.getItems());

        System.out.println("\n=== Furniture Storage ===");
        WarehouseDisplay.showStorage(furnitureStorage.getItems());
    }
}
