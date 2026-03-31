package collections.movie_recommendation_system;

import java.util.*;

class Movie {

    private int movieId;
    private String movieName;
    private List<Integer> ratings;

    public Movie(int movieId,String movieName){
        this.movieId = movieId;
        this.movieName = movieName;
        this.ratings = new ArrayList<>();
    }

    public int getMovieId(){
        return movieId;
    }

    public String getMovieName(){
        return movieName;
    }

    public List<Integer> getRatings(){
        return ratings;
    }
}