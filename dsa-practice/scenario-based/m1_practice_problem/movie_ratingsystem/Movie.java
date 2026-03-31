package collections.movie_ratingsystem;

import java.util.List;
import java.util.ArrayList;

public class Movie {
    private String movieName;
    private double ticketPrice;
    private List<Integer> ratings;

    public Movie(String movieName,double ticketPrice){
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.ratings = new ArrayList<>();
    }

    public String getMovieName(){
        return movieName;
    }
    public double getTicketPrice(){
        return ticketPrice;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    public List<Integer> getRatings(){
        return ratings;
    }
}
