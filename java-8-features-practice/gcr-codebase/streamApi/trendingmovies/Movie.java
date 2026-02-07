package streamApi.trendingmovies;

public class Movie {
    String name;
    double rating;
    int releaseYear;
    // Constructor
    public Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    // Getters
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Display method
    public void display() {
        System.out.println(name + " | Rating: " + rating + " | Year: " + releaseYear);
    }
}
