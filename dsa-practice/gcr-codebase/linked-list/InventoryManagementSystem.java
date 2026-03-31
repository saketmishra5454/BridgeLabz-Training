class ItemNode {  // Node class for linked list
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String name, int id, int quantity, double price) {  // Constructor
        this.itemName = name;
        this.itemId = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagement {           // Linked List class

    private ItemNode head = null;

    // Add at Beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Add at Position (1-based index)
    public void addAtPosition(String name, int id, int qty, double price, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, qty, price);
        ItemNode temp = head;
        int count = 1;
        while (count < pos - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed: " + id);
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed: " + id);
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update Quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated for ID: " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by Item ID
    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by Item Name
    public void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Display Item helper
    private void displayItem(ItemNode node) {
        System.out.println("Item ID   : " + node.itemId);
        System.out.println("Name      : " + node.itemName);
        System.out.println("Quantity  : " + node.quantity);
        System.out.println("Price     : " + node.price);
        System.out.println("---------------------------");
    }

    // Display All
    public void displayAll() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Calculate Total Inventory Value
    public void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value = " + total);
    }

    // Sorting (by Name or Price), asc=true or false for direction
    public void sort(String criteria, boolean asc) {
        head = mergeSort(head, criteria.toLowerCase(), asc);
    }

    private ItemNode mergeSort(ItemNode head, String criteria, boolean asc) {
        if (head == null || head.next == null) return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(head, criteria, asc);
        ItemNode right = mergeSort(nextOfMiddle, criteria, asc);

        return merge(left, right, criteria, asc);
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode merge(ItemNode a, ItemNode b, String criteria, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean compare;
        if (criteria.equals("name")) {
            compare = a.itemName.compareToIgnoreCase(b.itemName) <= 0;
        } else { // price
            compare = a.price <= b.price;
        }

        if (!asc) compare = !compare;

        if (compare) {
            a.next = merge(a.next, b, criteria, asc);
            return a;
        } else {
            b.next = merge(a, b.next, criteria, asc);
            return b;
        }
    }
}

public class InventoryManagementSystem {      // Main class
    public static void main(String[] args) {

        InventoryManagement inv = new InventoryManagement();

        inv.addAtEnd("Mouse", 101, 10, 500);
        inv.addAtBeginning("Keyboard", 102, 8, 800);
        inv.addAtPosition("Laptop", 103, 5, 45000, 2);
        inv.addAtEnd("Monitor", 104, 4, 12000);

        System.out.println("All Items:");
        inv.displayAll();

        System.out.println("Search By ID (103):");
        inv.searchById(103);

        System.out.println("Update Quantity (ID 101):");
        inv.updateQuantity(101, 20);

        System.out.println("Total Inventory Value:");
        inv.totalInventoryValue();

        System.out.println("Sorting by Name Asc:");
        inv.sort("name", true);
        inv.displayAll();

        System.out.println("Sorting by Price Desc:");
        inv.sort("price", false);
        inv.displayAll();

        System.out.println("Remove Item (ID 102):");
        inv.removeById(102);
        inv.displayAll();
    }
}
