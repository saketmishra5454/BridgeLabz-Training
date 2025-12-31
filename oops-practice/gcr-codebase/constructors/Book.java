// Program for Library Book System using Parameterized Constructor

class Book {

    // book details
    String title;
    String author;
    double price;
    boolean availability; // true means book is available

    // parameterized constructor

    Book(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        availability = av;
        // values assigned here
    }

    // method to borrow book
    void borrowBook() {
        if (availability == true) {
            System.out.println("Book borrowed successfully 👍");
            availability = false; // book is now not available
        } else {
            System.out.println("Sorry, book is already borrowed 😐");
        }
    }

    // method to display book details
    void display() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Available    : " + availability);
        System.out.println(); // just for space
    }

    // main method
    public static void main(String[] args) {

        // creating book object
        Book b1 = new Book("Clean Code", "Robert Martin", 550.0, true);

        // displaying book details
        System.out.println("Book Details:");
        b1.display();

        // borrowing the book
        System.out.println("Trying to borrow book...");
        b1.borrowBook();

        // displaying details after borrowing
        System.out.println("\nBook Details After Borrowing:");
        b1.display();

        // trying to borrow again
        System.out.println("Trying to borrow again...");
        b1.borrowBook();
    }
}
