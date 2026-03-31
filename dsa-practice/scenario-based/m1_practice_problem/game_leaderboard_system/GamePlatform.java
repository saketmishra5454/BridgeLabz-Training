				package collections.game_leaderboard_system;

import java.util.*;

class GamePlatform {

    private Map<String, Player> players = new LinkedHashMap<>();

    public void addPlayer(String name) {
        // write logic
    	Player existing = players.putIfAbsent(name, new Player(name));
    	
    	if(existing==null) {
    		System.out.println("Player Added Successfully");
    	}
    	else {
    		System.out.println("Player Already Exists");
    	}
    }

	public void removePlayer(String name){

		Player removedPlayer = players.remove(name);

		if(removedPlayer!=null){
			System.out.println("Player Removed Successfully");
		}
		else{
			System.out.println("Player Not Found");
		}
	}

    public void addScore(String name, int score) {
        // write logic
    	
    	Player data = players.get(name);
    	
    	if(data!=null) {
    		data.getScores().add(score);
    		System.out.println("Score Added Successfully");
    	}
    	else {
    		System.out.println("Player Not Found");
    	}
    }

    public void calculateAverageScore(String name) {
        // write logic
    	Player player = players.get(name);
    	
    	if(player == null) {
    		System.out.println("No Such Player is found");
    	}
    	else {
    		List<Integer> scores = player.getScores();
    		
    		if(scores.isEmpty()){
    		    System.out.println("No Scores Yet");
    		    return;
    		}
    		
    		double sum = 0;
    		for(int sco : scores) {
    			sum += sco;
    		}
    		double avgScore = sum/scores.size();
    		
    		System.out.println("The Average Scores of "+player.getName()+ " is :"+ avgScore);
    	}
    }

    public void findTopPlayer() {
        // write logic
    	if(players.isEmpty()) {
    		System.out.println("No Player is Available");
    		return;
    	}
    	double maxScore = 0;
		String topPlayer = null;
		
    	for(Map.Entry<String,Player> entry : players.entrySet()) {
    		Player data = entry.getValue();
    		
    		
    		List<Integer> scores = data.getScores();
    		
    		if(scores.isEmpty()){
    		    continue;
    		}
    		
    		double sum = 0;
    		for(int sco : scores) {
    			sum+=sco;
    		}
    		
    		double avgScore = sum/scores.size();
    	
    		
    		if(avgScore>maxScore) {
    			maxScore = avgScore;
    			topPlayer = data.getName();
    		}
    	}
    		
    		if(topPlayer != null) {
    			System.out.println("Top Player is :"+ topPlayer);
    			System.out.println("With Average Score: "+maxScore);
    			
    		}
    		else {
    			System.out.println("No Top Rated Player Found");
    		}
    }
    

    public void displayPlayers() {
        // write logic
    	for(Map.Entry<String,Player> entry : players.entrySet()) {
    		
    		Player player = entry.getValue();
    		
    		System.out.println("Player Name: "+ player.getName());
    		System.out.println("Scores: "+ player.getScores());

			System.out.println("-----------------------------------------");
    		
    	}
    	
    }
}