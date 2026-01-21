import java.util.*;
class Book {                //this is book class
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return this.title.equals(b.title) && this.author.equals(b.author);
    }
}


class Library {                 //this is a library class
    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    HashSet<Book> bookSet = new HashSet<>(); // to avoid duplicates (optional)

    // Add Book To Genre
    public void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());

        if (!bookSet.contains(book)) {
            catalog.get(genre).add(book);
            bookSet.add(book);
            System.out.println("Added: " + book);
        } else {
            System.out.println("Duplicate book ignored: " + book);
        }
    }

    // Borrow (Remove from genre list)
    public void borrowBook(String genre, Book book) {
        if (catalog.containsKey(genre) && catalog.get(genre).remove(book)) {
            System.out.println("Borrowed: " + book);
        } else {
            System.out.println("Book not found for borrowing.");
        }
    }

    // Return (Add back)
    public void returnBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).addFirst(book);
        System.out.println("Returned: " + book);
    }

    // Display All
    public void displayCatalog() {
        System.out.println("\n--- Library Catalog ---");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " => " + catalog.get(genre));
        }
    }
}
public class BookShelf {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b3 = new Book("Inferno", "Dan Brown");

        lib.addBook("Fantasy", b1);
        lib.addBook("Fantasy", b2);
        lib.addBook("Thriller", b3);
        lib.addBook("Fantasy", b1); // Duplicate ignored

        lib.displayCatalog();

        lib.borrowBook("Fantasy", b1);
        lib.displayCatalog();

        lib.returnBook("Fantasy", b1);
        lib.displayCatalog();
    }
}