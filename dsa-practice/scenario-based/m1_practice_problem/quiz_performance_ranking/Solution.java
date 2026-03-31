package collections.quiz_performance_ranking;

import java.util.*;

class Student {

    String studentName;
    String department;
    int quiz1;
    int quiz2;
    int quiz3;

    public Student(String studentName, String department, int quiz1, int quiz2, int quiz3) {
        this.studentName = studentName;
        this.department = department;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
    }

    // method to calculate total score
    public int getTotalScore() {
         return quiz1 + quiz2 + quiz3;
       // return 0;
    }
}


public class Solution {

    static List<Student> records = new ArrayList<>();


    // METHOD 1 : Record Student
    public static void recordStudent(String name, String department, int q1, int q2, int q3) {
    	
    	//Student student = 
    	
    	//for()
    	
    	records.add(new Student(name,department,q1,q2,q3));
    	System.out.println("Record Added: "+ name);
    		

       

    }


    // METHOD 2 : Top by Department
    public static void topByDepartment(String department) {

        // if records empty → print "No Records Available"
    	if(records.isEmpty()) {
    		System.out.println("No Records Available");
    		return;
    	}

        // filter students of given department
    	int maxMarks = Integer.MIN_VALUE;
    	
    	boolean flag = false;
    	
    	for(Student st : records) {
    		int totalScore = 0;
    		if(department.equals(st.department)) {
    			totalScore = st.getTotalScore();
    			flag = true;
    			
    			if(totalScore>maxMarks) {
        			maxMarks = totalScore;
        		}
    		}
    	}
    	if(!flag) {
    		System.out.println("Department not found");
    		return;
    	}
    			
    	
    	int totalScore = 0;
    	for(Student st : records) {
    		if(department.equals(st.department)) {
    			totalScore = st.getTotalScore();
    		
    	
    			
    	if(totalScore==maxMarks) {
			System.out.println(st.studentName+" "+totalScore);
		    }
    	
    	}
     }
    		
    }
    		
  

    // METHOD 3 : Top by Quiz
    public static void topByQuiz(String quizName) {
    	
    	if(records.isEmpty()) {
    		System.out.println("No Records Available");
    		return;
    	}
    	
    	int maxMarks = Integer.MIN_VALUE;
    	for(Student student:records ) {
    	int score = 0;
    	
    	if(quizName.equals("Q1"))
    	    score = student.quiz1;
    	else if(quizName.equals("Q2"))
    	    score = student.quiz2;
    	else if(quizName.equals("Q3"))
    	    score = student.quiz3;

    	if(score > maxMarks)
    	    maxMarks = score;
    	
    }
    	
    	
    	for(Student s : records) {
    		
    		int score = 0;
    		if(quizName.equals("Q1")) {
    			score = s.quiz1;
    		}
    		
    		else if(quizName.equals("Q2")) {
    			score = s.quiz2;
    		}
    		else if(quizName.equals("Q3")) {
    			score = s.quiz3;
    		}
    		
    		if(score  == maxMarks) {
    			
    			System.out.println(s.studentName+" "+score);
    		}
    	}

    }


    public static void main(String[] args) {
    	
    	//Solution obj = new Solution();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Input of Operation:");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            
            String[] data = input.split(" ");
            
            if(data[0].equals("Record")) {
            	
            	recordStudent(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
            	
            }
            
            
            if(data[0].equals("Top")) {
            	
            	if(data[1].equals("Q1") || data[1].equals("Q2") || data[1].equals("Q3")) {
            		topByQuiz(data[1]);
            	}
            	
            	else {
            		topByDepartment(data[1]);
            	}
            }

        }

    }
}