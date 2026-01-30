import java.util.Scanner;

public class LibraryManagement {

    // storing book titles
    static String[] bookTitles = {
        "Java Basics",
        "C Programming",
        "Python Guide",
        "Database Systems"
    };

    // storing author names
    static String[] bookAuthors = {
        "Herbert Schildt",
        "Dennis Ritchie",
        "Mark Lutz",
        "Elmasri"
    };

    // true means book is avalable
    static boolean[] bookStatus = {
        true, true, true, true
    };

    // method to display all books
    static void showBooks() {
        System.out.println("\nList of Books:");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println((i + 1) + ". " + bookTitles[i] +
                    " by " + bookAuthors[i] +
                    " - " + (bookStatus[i] ? "Available" : "Checked Out"));
        }
    }

    // search book using part of title
    static void searchBook(String name) {
        boolean found = false;

        for (int i = 0; i < bookTitles.length; i++) {
            // using contains to find title
            if (bookTitles[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println(bookTitles[i] + " by " + bookAuthors[i] +
                        " - " + (bookStatus[i] ? "Available" : "Checked Out"));
                found = true;
            }
        }

        if (!found) {
            System.out.println("library_book_search.Book not found");
        }
    }

    // checkout or return book
    static void updateStatus(int index) {
        if (index < 0 || index >= bookTitles.length) {
            System.out.println("Wrong book number");
            return;
        }

        if (bookStatus[index] == true) {
            bookStatus[index] = false;
            System.out.println("library_book_search.Book checked out");
        } else {
            bookStatus[index] = true;
            System.out.println("library_book_search.Book returned");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nlibrary_book_search.Library Menu");
            System.out.println("1. Show all books");
            System.out.println("2. Search book");
            System.out.println("3. Checkout or Return");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    showBooks();
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();
                    searchBook(name);
                    break;

                case 3:
                    showBooks();
                    System.out.print("Enter book number: ");
                    int num = sc.nextInt();
                    updateStatus(num - 1);
                    break;

                case 4:
                    System.out.println("Program End");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 4);

        sc.close();
    }
}
