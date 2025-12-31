
class BookClass {

    // declaring variables
    String title;
    String author;
    double price;

    // default constructor
    // this will run when no values are passed
    BookClass() {
        title = "Not Given";
        author = "Unknown";
        price = 0.0;
        // default values set here
    }

    // parameterized constructor
    BookClass(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
       
    }

    // method to display book details
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println(); // just for gap
    }

    // main method
    public static void main(String[] args) {

        // creating object using default constructor
        BookClass b1 = new BookClass();
        System.out.println("Book using Default Constructor:");
        b1.display();

        // creating object using parameterized constructor
        BookClass b2 = new BookClass("Java Programming", "James Gosling", 499.50);
        System.out.println("Book using Parameterized Constructor:");
        b2.display();
    }
}
