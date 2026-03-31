package collectors.library_bookstatistics;

import java.util.*;
import java.util.stream.*;

public class LibraryService {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 300),
                new Book("Spring Boot", "Programming", 450),
                new Book("History of India", "History", 500),
                new Book("World War II", "History", 350),
                new Book("Data Structures", "Programming", 400)
        );

        Map<String, IntSummaryStatistics> stats = books.stream().collect(Collectors.groupingBy(Book::getGenre
                , Collectors.summarizingInt(Book::getPages)));


        stats.forEach((genre, summary) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + summary.getSum());
            System.out.println("Average Pages: " + summary.getAverage());
            System.out.println("Max Pages: " + summary.getMax());
            System.out.println("-----------------------");
        });
    }
}