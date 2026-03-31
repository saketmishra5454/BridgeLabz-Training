package eventpro_feedback_ratinganalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackService {

    private Map<String,List<Integer>> feedbackMap = new HashMap<>();

// Add Rating Method

    public void addRating(String eventId, int rating) throws InvalidRatingException{

        if(eventId == null || eventId.isEmpty()){
            System.out.println("Please Enter the EventId which you want to Add Ratings");
            return;
        }
        if(rating < 1 || rating > 5){
            throw new InvalidRatingException("\nPlease Give the valid Rating { Like: 1<=Rating<=5 }");
        }
        feedbackMap.putIfAbsent(eventId, new ArrayList<>());
        feedbackMap.get(eventId).add(rating);
    }

    public boolean eventExists(String eventid){
        if(feedbackMap.containsKey(eventid)){
            return true;
        }
        else{
            return false;
        }
    }

    // Calculating Average Rating for an Event

    public double getAverageRating(String eventId){

        List<Integer> avgList = feedbackMap.get(eventId);

        if(avgList == null || avgList.isEmpty()){
            return 0.0;
        }

        int sum = 0;
        for(Integer e: avgList){
            sum+=e;
        }
        return (double) sum/avgList.size();
    }

    //method to find the Top-Rated Event(s)

    public List<String> getTopRatedEvents(){

        if (feedbackMap.isEmpty()) {
            return new ArrayList<>();
        }

        Map<String,Double> avgTopMap = new HashMap<>();

        double maxRating = Double.MIN_VALUE;

        for(String id: feedbackMap.keySet()){
            avgTopMap.put(id,getAverageRating(id));

            maxRating = Math.max(maxRating,avgTopMap.get(id));

        }

        List<String> topRatedEvents = new ArrayList<>();

        for(String id : avgTopMap.keySet()){

            if(Double.compare(maxRating, avgTopMap.get(id)) == 0){
                topRatedEvents.add(id);

            }
        }
        return topRatedEvents;
    }

//        Map<String, Double> averageRatingMap = new HashMap<>();
//
//        double maxRating = Double.MIN_VALUE;
//
//        for(String id : feedbackMap.keySet()) {
//            averageRatingMap.put(id, getAverageRating(id));
//            maxRating = Math.max(maxRating, averageRatingMap.get(id));
//        }
//
//        List<String> topRatedEvents = new ArrayList<>();
//
//        for(String id : averageRatingMap.keySet()) {
//            if(maxRating == averageRatingMap.get(id)) {
//                topRatedEvents.add(id);
//            }
//        }
//        return topRatedEvents;



//    }

}
