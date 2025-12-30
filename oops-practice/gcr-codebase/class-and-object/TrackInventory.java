class TrackInventory {
    String itemCode;
    String itemName;
    double itemPrice;

    // Constructor
    TrackInventory(String itemCode, String itemName, double itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        TrackInventory i1 = new TrackInventory("01AA", "Water bottle", 500.0);
        TrackInventory i2 = new TrackInventory("01BB", "Rice", 700.0);
        TrackInventory i3 = new TrackInventory("02AA", "blackboard", 400.0);

        i1.displayItem();
        i2.displayItem();
        i3.displayItem();
    }
}

