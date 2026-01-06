class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default: available
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

class Library {
    Book[] books;
    int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        }
    }

    void displayBooks() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    void searchBook(String partialTitle) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(partialTitle.toLowerCase())) {
                books[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with title containing: " + partialTitle);
        }
    }

    void checkoutBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (books[i].isAvailable) {
                    books[i].isAvailable = false;
                    System.out.println("Book checked out: " + title);
                } else {
                    System.out.println("Book already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (!books[i].isAvailable) {
                    books[i].isAvailable = true;
                    System.out.println("Book returned: " + title);
                } else {
                    System.out.println("Book was not checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library(10);

        lib.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        lib.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        lib.addBook(new Book("Clean Code", "Robert C. Martin"));

        System.out.println("All Books:");
        lib.displayBooks();

        System.out.println("Search Results:");
        lib.searchBook("Harry");

        System.out.println("Checkout:");
        lib.checkoutBook("The Hobbit");
        lib.displayBooks();

        System.out.println("Return:");
        lib.returnBook("The Hobbit");
        lib.displayBooks();
    }
}