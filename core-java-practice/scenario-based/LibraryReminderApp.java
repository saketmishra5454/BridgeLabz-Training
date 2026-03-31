import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int finePerDay = 5;          // fine amount per late day
        int totalFine = 0;

        // processing 5 books using for-loop 
        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book + " Details");

            //  taking due date
            System.out.print("Enter due date (day number): ");
            int dueDate = scanner.nextInt();

            //  taking return date
            System.out.print("Enter return date (day number): ");
            int returnDate = scanner.nextInt();

            //  checking delay
            if (returnDate > dueDate) {

                int lateDays = returnDate - dueDate;

                //  calculating fine 
                int bookFine = lateDays * finePerDay;
                totalFine += bookFine;

                System.out.println("Late by " + lateDays + " days.");
                System.out.println("Fine for this book: ₹" + bookFine);

            } else {

                System.out.println("Book returned on time. No fine.");
            }

        }

        System.out.println("\nTotal Fine for all books: ₹" + totalFine);

        scanner.close();

    }
}
