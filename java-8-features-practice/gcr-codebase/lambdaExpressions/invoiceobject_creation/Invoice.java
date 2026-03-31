package invoiceobject_creation;

// Invoice class
public class Invoice {

    int id;

    // Constructor
    Invoice(int id) {

        this.id = id;
    }

    // Display method
    public void display() {

        System.out.println("Invoice ID: " + id);
    }
}
