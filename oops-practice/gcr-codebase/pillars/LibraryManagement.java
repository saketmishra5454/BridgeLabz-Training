// Interface for reservation feature
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {

    // encapsulation: private fields
    private int itemId;
    private String title;
    private String author;

    // sensitive data (borrower info)
    private String borrowerName;
    private boolean isAvailable = true;

    // constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // getters only
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    // concrete method
    public void getItemDetails() {
        System.out.println("Item Id: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // protected methods to manage borrower safely
    protected void setBorrower(String name) {
        borrowerName = name;
        isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    // abstract method
    public abstract int getLoanDuration();
}

// Book class
class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // short time for magazine
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVD for less days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already taken");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Main class
public class LibraryManagement {

    public static void main(String[] args) {

        // polymorphism: parent reference
        LibraryItem item1 = new Book(1, "Java Basics", "James");
        LibraryItem item2 = new Magazine(2, "Tech Monthly", "Editor");
        LibraryItem item3 = new DVD(3, "Learning OOP", "Trainer");

        LibraryItem[] items = { item1, item2, item3 };

        for (LibraryItem item : items) {
            System.out.println("-------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // interface reference
            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem("Student1");
        }
    }
}
