class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    BookNode prev;
    BookNode next;
// Constructor taking all parameters from the node
    public BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.prev = null;
        this.next = null;
    }
}

class Library {         // Doubly Linked List for Library Management

    private BookNode head = null;
    private BookNode tail = null;

    // Add at beginning
    public void addAtBeginning(String t, String a, String g, int id, boolean av) {
        BookNode newNode = new BookNode(t, a, g, id, av);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(String t, String a, String g, int id, boolean av) {
        BookNode newNode = new BookNode(t, a, g, id, av);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(String t, String a, String g, int id, boolean av, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(t, a, g, id, av);
            return;
        }

        BookNode newNode = new BookNode(t, a, g, id, av);
        BookNode temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    // Remove by Book ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("No books to remove.");
            return;
        }

        BookNode temp = head;

        // Removing head
        if (temp.bookId == id) {
            if (temp.next != null) {
                head = temp.next;
                head.prev = null;
            } else {
                head = tail = null;
            }
            System.out.println("Book removed: " + id);
            return;
        }

        // Search for other nodes
        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        temp.prev.next = temp.next;
        System.out.println("Book removed: " + id);
    }

    // Search by Title
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // Search by Author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Update Availability
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated for Book ID " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No books in library.");
            return;
        }
        BookNode temp = head;
        System.out.println("Books (Forward):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books in library.");
            return;
        }
        BookNode temp = tail;
        System.out.println("Books (Reverse):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books in Library: " + count);
    }

    // Display Book helper
    private void displayBook(BookNode b) {
        System.out.println("Book ID   : " + b.bookId);
        System.out.println("Title     : " + b.title);
        System.out.println("Author    : " + b.author);
        System.out.println("Genre     : " + b.genre);
        System.out.println("Available : " + (b.available ? "Yes" : "No"));
        System.out.println("-------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addAtEnd("Clean Code", "Robert Martin", "Programming", 101, true);
        lib.addAtBeginning("Effective Java", "Joshua Bloch", "Programming", 102, false);
        lib.addAtPosition("Algorithms", "CLRS", "CS Theory", 103, true, 2);

        lib.displayForward();
        System.out.println();

        lib.searchByTitle("Clean Code");
        System.out.println();

        lib.searchByAuthor("Joshua Bloch");
        System.out.println();

        lib.updateAvailability(102, true);
        lib.displayForward();
        System.out.println();

        lib.removeById(103);
        lib.displayForward();
        System.out.println();

        lib.displayReverse();
        System.out.println();

        lib.countBooks();
    }
}
