package collections.library_book_ratingsystem;

import java.util.*;

class Library {

    private Map<String, Book> books = new LinkedHashMap<>();

    public void addBook(String title, String author) {
        // write logic

        Book existing = books.putIfAbsent(title, new Book(title, author));
        if(existing == null) {
        System.out.println("Book Added Successfully");
        }
    	else {
    		System.out.println("Book Already Present");
    	}
     }

    public void removeBook(String title) {
        // write logic

        Book removedBook = books.remove(title);

        if (removedBook != null) {
            System.out.println("Book Removed Successfully");
        } else {
            System.out.println("Book Not found");
        }

    }

    public void addRating(String title, int rating) {
        // write logic
        Book rateAdd = books.get(title);

        if (rateAdd != null) {

            rateAdd.getRatings().add(rating);
            System.out.println("Rating added Successfully");
        } else {
            System.out.println("No Book is Found");
        }
    }

    public void calculateAverageRating(String title) {
        // write logic
        Book book = books.get(title);

        if (book == null) {
            System.out.println("No Book is Available");
            return;
        } else {

            List<Integer> ratings = book.getRatings();

            if (ratings.isEmpty()) {
                System.out.println("No rating yet");
                return;
            }

            double sum = 0;
            for (int rate : ratings) {
                sum += rate;
            }
            double avgRating = sum / ratings.size();

            System.out.println("The Average Rating for " + book.getTitle() + " is:" + avgRating);

        }
    }

    public void topRatedBook() {
        if (books.isEmpty()) {
            System.out.println("No Book is Available");
            return;
        }

        double maxAverage = 0;
        String topRated = null;

        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();


            List<Integer> ratings = book.getRatings();

            if (ratings.isEmpty()) {
                continue;

            }

            double sum = 0;
            for (int rate : ratings) {
                sum += rate;
            }

            double avgRating = sum / ratings.size();


            if (avgRating > maxAverage) {
                maxAverage = avgRating;
                topRated = book.getTitle();
            }
        }

        if (topRated == null) {
            System.out.println("No Rated Book Available");
        } else {
            System.out.println("Top Rated Book: " + topRated);
            System.out.println("With Rating: " + maxAverage);

        }
    }

    public void displayBooks() {
        // write logic
        if (books.isEmpty()) {
            System.out.println("No book is Available");

        } else {
            for (Map.Entry<String, Book> entry : books.entrySet()) {
                Book book = entry.getValue();
                System.out.println("Book Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Ratings: " + book.getRatings());
                System.out.println("-------------------------------------");
            }
        }
    }
}