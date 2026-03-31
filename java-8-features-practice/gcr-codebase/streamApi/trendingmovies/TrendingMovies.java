package streamApi.trendingmovies;

import java.util.*;

public class TrendingMovies {
    public static void main(String[] args) {
        // Creating movie list
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Avengers", 8.9, 2019));
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Pushpa", 8.2, 2021));
        movies.add(new Movie("KGF", 8.5, 2022));
        movies.add(new Movie("RRR", 8.7, 2022));
        movies.add(new Movie("Jawan", 7.9, 2023));
        movies.add(new Movie("Pathaan", 7.8, 2023));
        movies.add(new Movie("Titanic", 7.9, 1997));

        System.out.println("Top 5 Trending Movies:\n");

        // Stream API
        movies.stream()
                // Filter movies after 2010
                .filter(m -> m.getReleaseYear() >= 2010)

                // Sort by rating (Descending order)
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))

                // Take only top 5 movies
                .limit(5)

                // Print each movie
                .forEach(Movie::display);
    }
}

