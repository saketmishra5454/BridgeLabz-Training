package collections.library_book_ratingsystem;

import java.util.*;

class Book {

    private String title;
    private String author;
    private List<Integer> ratings;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<Integer> getRatings() {
        return ratings;
    }
}
