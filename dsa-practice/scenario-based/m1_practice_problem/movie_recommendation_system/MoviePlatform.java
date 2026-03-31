package collections.movie_recommendation_system;

import java.util.*;

class MoviePlatform {

    private Map<Integer,Movie> movies = new LinkedHashMap<>();

    public void addMovie(int id,String name){
        // write logic
    	Movie addMovie =movies.putIfAbsent(id,new Movie(id,name));
    	
    	if(addMovie == null) {
    		System.out.println("Movie Added Successfully");
    		
    	}
    	else {
    		System.out.println("Movie Already Exists");
    	}
    }
    
    public void removeMovie(int id) {
    	Movie removedMovie=movies.remove(id);
    	
    	if(removedMovie == null) {
    		System.out.println("Movie Not Found");
    		return;
    		
    	}
    	
    	//if(removedMovie != null) {
    	else {
    		System.out.println("Movie Name: "+ removedMovie.getMovieName()+" is Removed Successfully");
    	}
    	
    }

    public void addRating(int id,int rating){
        // write logic
    	
    	if(movies.isEmpty()) {
    		System.out.println("No Movie is Available");
    		return;
    	}
    	
    	Movie addRate = movies.get(id);
    	
    	if(addRate == null) {
    		System.out.println("Movie Not Found");
    		return;
    	}
    	else {
    	addRate.getRatings().add(rating);
    	System.out.println("Rating Added Successfully");
    	return;
    	}
    	
    }

    public void calculateAverageRating(int id){
        // write logic
    	
    	if(movies.isEmpty()) {
    		System.out.println("No Movie is Available");
    		return;
    	}
    	
        Movie MovieDetails = movies.get(id);
        
        if(MovieDetails == null) {
        	System.out.println("Movie Not Found");
        	return;
        }
        
        List<Integer> ratings = MovieDetails.getRatings();
        
        if(ratings.isEmpty()){
            System.out.println("No Ratings Yet");
            return;
        }
        
        double sum = 0;
        for(int rate:ratings) {
        	sum+=rate;
        }
        	
        	double average = sum/ratings.size();
        	
        System.out.println("The Average Ratings of "+ MovieDetails.getMovieName() +" is: "+average);
    	
    }

    public void displayTopRatedMovies(){
        // write logic
    	
    	if(movies.isEmpty()) {
    		System.out.println("No Movie is Available");
    		return;
    	}
    	
    	double maxRatings = 0;
    	String topRated = null;
    	
    	for(Movie mov : movies.values()) {
    		
    		if(mov == null) {
    			continue;
    		}
    		
    		List<Integer> ratings = mov.getRatings();
    		
    		if(ratings.isEmpty()) {
    			continue;
    		}
    		 
    		double sum = 0;
    		for(int i:ratings) {
    			sum+=i;
    		}
    		double avg = sum/ratings.size();
    		
    		
    		if(avg>maxRatings) {
    			maxRatings = avg;
    			topRated = mov.getMovieName();
    		}
    	}
    	
    	if(topRated != null) {
    		System.out.println("Top Rated Movie is: "+ topRated);
    		System.out.println("With Average Rating: "+ maxRatings);
    	}
    	
    	else {
    		System.out.println("Top Rated Movie not Found");
    	}
    	
    }

    public void displayMovies(){
        // write logic
    	
    	if(movies.isEmpty()) {
    		System.out.println("No Movie is Available");
    		return;
    	}
    	
    	for(Movie mov:movies.values()) {
    		if(mov == null) {
    			continue;
    		}
    		System.out.println("MovieId: "+ mov.getMovieId());
    		System.out.println("Name: "+ mov.getMovieName());
    		System.out.println("Ratings: "+mov.getRatings());
    	}
    }
}