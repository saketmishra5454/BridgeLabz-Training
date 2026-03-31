import java.util.Scanner;

class Movie {           // Movie Node class
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating) {     // Constructor
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieManagementSystem {
    Movie head = null;
    Movie tail = null;

    // Insert at beginning
    void insertAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at end
    void insertAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert at specific position
    void insertAtPosition(String title, String director, int year, double rating, int pos) {
        if (pos == 1) {
            insertAtBeginning(title, director, year, rating);
            return;
        }
        Movie newNode = new Movie(title, director, year, rating);
        Movie temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
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

    // Remove movie by title
    void deleteByTitle(String title) {
        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found!");
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;

        System.out.println("Movie deleted successfully!");
    }

    // Search by director
    void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("\nFound: " + temp.title + " (" + temp.year + ") Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found for this director!");
    }

    // Search by Rating
    void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                System.out.println("\nFound: " + temp.title + " (" + temp.year + ") Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found matching this rating!");
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("No movies to display!");
            return;
        }
        Movie temp = head;
        System.out.println("\n--- Movies (Forward) ---");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        if (tail == null) {
            System.out.println("No movies to display!");
            return;
        }
        Movie temp = tail;
        System.out.println("\n--- Movies (Reverse) ---");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Main method
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        MovieManagementSystem list = new MovieManagementSystem();
        int choice, year, pos;
        String title, director;
        double rating;

        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Update Rating");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {                 // switch cases for menu options
                case 1 -> {
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    list.insertAtBeginning(title, director, year, rating);
                }
                case 2 -> {
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    list.insertAtEnd(title, director, year, rating);
                }
                case 3 -> {
                    System.out.print("Enter Title, Director, Year, Rating & Position: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    pos = sc.nextInt();
                    list.insertAtPosition(title, director, year, rating, pos);
                }
                case 4 -> {
                    System.out.print("Enter Title to Delete: ");
                    title = sc.nextLine();
                    list.deleteByTitle(title);
                }
                case 5 -> {
                    System.out.print("Enter Director Name: ");
                    director = sc.nextLine();
                    list.searchByDirector(director);
                }
                case 6 -> {
                    System.out.print("Enter Minimum Rating: ");
                    rating = sc.nextDouble();
                    list.searchByRating(rating);
                }
                case 7 -> {
                    System.out.print("Enter Title and New Rating: ");
                    title = sc.nextLine();
                    rating = sc.nextDouble();
                    list.updateRating(title, rating);
                }
                case 8 -> list.displayForward();
                case 9 -> list.displayReverse();
                case 10 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice!");       // default case
            }
        }
    }
}
