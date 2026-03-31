package library_book_search;

import java.util.ArrayList;
import java.util.List;

// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// library_book_search.Book class
class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

// library_book_search.Library class
class Library {

    private List<Book> books = new ArrayList<>();

    // load books from array into list
    public void loadBooks(Book[] bookArray) {
        for (Book b : bookArray) {
            books.add(b);
        }
    }

    // search book by partial title
    public void searchBook(String keyword) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                b.displayBook();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with given title.");
        }
    }

    // checkout book
    public void checkoutBook(String title)
            throws BookNotAvailableException {

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {

                if (!b.isAvailable()) {
                    throw new BookNotAvailableException(
                            "library_book_search.Book is already checked out");
                }

                b.setAvailable(false);
                System.out.println("library_book_search.Book checked out successfully.");
                return;
            }
        }

        System.out.println("library_book_search.Book not found.");
    }

    // display all books
    public void displayAllBooks() {
        for (Book b : books) {
            b.displayBook();
            System.out.println();
        }
    }
}

// Main class
public class LibraryBookSearch {

    public static void main(String[] args) {

        // storing book data in array
        Book[] bookArray = {
                new Book("Effective Java", "Joshua Bloch", true),
                new Book("Clean Code", "Robert Martin", true),
                new Book("Java Complete Reference", "Herbert Schildt", false)
        };

        Library library = new Library();
        library.loadBooks(bookArray);

        System.out.println("All Books:");
        library.displayAllBooks();

        System.out.println("Search Result:");
        library.searchBook("Java");

        try {
            library.checkoutBook("Java Complete Reference");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
