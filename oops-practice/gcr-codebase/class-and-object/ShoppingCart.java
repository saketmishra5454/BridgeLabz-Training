class ShoppingCart {
    String itemName;
    double price;
    int quantity;

    // Constructor
    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add item
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    // Method to remove item
    void removeItem(int qty) {
        quantity -= qty;
        System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost: $" + total);
    }

    public static void main(String[] args) {
        ShoppingCart item = new ShoppingCart("Laptop", 999.99, 1);

        System.out.println("Item: Laptop, Price: $999.99, Quantity: 1");
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}

