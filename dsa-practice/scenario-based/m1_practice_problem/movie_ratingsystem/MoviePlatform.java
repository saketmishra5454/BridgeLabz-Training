package collections.movie_ratingsystem;

import java.util.*;

class MoviePlatform {

    private Map<String, Movie> movies = new LinkedHashMap<>();

    public void addMovie(String name, double price) {
        // Write logic

        if(!movies.containsKey(name)){
            movies.put(name,new Movie(name,price));
            System.out.println("Movie added Successfully");

        }
    }

    public void removeMovie(String name) {
        // Write logic
        Movie removedMovie = movies.remove(name);
        
        if(removedMovie!=null){
            System.out.println("Movie Removed Successfully");
        }
        else{
            System.out.println("Movie Not Found");
        }
    }

    public void addRating(String name, int rating) {
        // Write logic
//    	if(movies.isEmpty()) {
//    		System.out.println("No Movie is Available");
//    		return;
//    	}
    	
    	Movie ratings = movies.get(name);

        if(ratings!=null){
            ratings.getRatings().add(rating);
            System.out.println("Movie Rating Added Successfully");
        }
        else{
            System.out.println("No Movie is Found");
        }
    }

    public void calculateAverageRating(String name) {
        // Write logic
        Movie moviedetails = movies.get(name);
        
        if(moviedetails == null){
            System.out.println("No such Movie is Available");
            return;
           
        }
        else{

            List<Integer> movieRating = moviedetails.getRatings();
            
            if(movieRating.isEmpty()) {
            	System.out.println("No Rating Yet");
            	return;
            }

            double sum = 0;
            for(int rate:movieRating){
                sum+=rate;
            }
            double MovieAverage = sum/movieRating.size();

            System.out.println("Average Rating for "+ name + " is : "+ MovieAverage);
        }

    }
    
    public void findTopRatedMovie() {
        // Write your logic here
        if(movies.isEmpty()){
            System.out.println("No Movies Available");
            return;
        }
        double maxAverage = 0;
        String topMovie = null;

        for(Map.Entry<String,Movie> entry : movies.entrySet()) {
            Movie movie = entry.getValue();

            List<Integer> ratings = movie.getRatings();

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
                topMovie = movie.getMovieName();
            }
        }

            if (topMovie == null) {
                System.out.println("No Rated Movies Available");
            } else {
                System.out.println("Top Rated Movie: " + topMovie);
                System.out.println("Average Rating: " + maxAverage);
            }
        }
    

    public void displayMovies() {
        // Write logic
        for(Map.Entry<String,Movie> entry : movies.entrySet()){
            System.out.println("Movie Name: "+ entry.getValue().getMovieName());
            System.out.println("Price: "+ entry.getValue().getTicketPrice());
            System.out.println("Rating: "+entry.getValue().getRatings());           
        }
    }
}
