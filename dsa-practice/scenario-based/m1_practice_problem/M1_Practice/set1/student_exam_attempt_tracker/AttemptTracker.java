package collections.M1_Practice.set1.student_exam_attempt_tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Attempt {

    String id;
    int score;

    public Attempt(String id, int score){
        this.id = id;
        this.score = score;
    }
}

public class AttemptTracker {

    static Map<String, List<Attempt>> data = new HashMap<>();

    public static void attempt(String student, String id, int score){
    	
    	data.putIfAbsent(student,new ArrayList<>());
    	
    	List<Attempt> students = data.get(student);
    	
    	for(Attempt a : students) {
    	if(a.id.equals(id)) {
    		return;
    	}
    		
    	}
    	
    	students.add(new Attempt(id,score));
    }

    public static void viewAttempts(String student){

        // sort attempts
    	
    	if(!data.containsKey(student)) {
    		System.out.println("Student Not Found");
    		return;
    	}
    	
    	List<Attempt> details = data.get(student);
    	
    	Collections.sort(details,(a,b)->{
    		if(a.score != b.score) {
    			return a.score-b.score;
    		}
    		
    		return a.id.compareTo(b.id);
    	});
    	
    	
    	for(Attempt a : details) {
    		System.out.println(student+ " "+ a.id +" "+ a.score);
    	}

        // print
    }

    public static void bestAttempt(String student){

        // find max score
    	
    	if(!data.containsKey(student)) {
    		System.out.println("Student Not Found");
    		return;
    	}
    	List<Attempt> details = data.get(student);
    	
    	Attempt best = details.get(0);
    	
    	for(Attempt a : details) {
    		if(a.score>best.score) {
    			best = a;
    		}
    	}
    	
    	System.out.println(student+" "+best.id+" "+ best.score);
    	
   
    }

    public static void totalScore(String student){

        // sum scores
    	if(!data.containsKey(student)) {
    		System.out.println("Student Not Found");
    		return;
    	}
    	
    	List<Attempt> details = data.get(student);
    	int sum = 0;
    	for(Attempt a : details) {
    		sum+=a.score;
    	}
    	
    	System.out.println(student+" "+ sum);
    	
    	
    }
    
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take Input: ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n;i++) {
			
			String input = sc.nextLine();
			
			String[] data = input.split(" ");
			
			
			if(data[0].equals("ATTEMPT")){
				
				attempt(data[1],data[2],Integer.parseInt(data[3]));
				
			}
			
			else if(data[0].equals("VIEW_ATTEMPTS")) {
				viewAttempts(data[1]);
			}
			
			else if(data[0].equals("BEST_ATTEMPT")) {
				bestAttempt(data[1]);
			}
			
			else if(data[0].equals("TOTAL_SCORE")) {
				totalScore(data[1]);
			}
			
			else {
				return;
			}
			
		}
		
	}
}