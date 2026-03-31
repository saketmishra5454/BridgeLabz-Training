package collections.M1_Practice.set2.quiz_performance_ranking;

import java.util.*;

class Student {

    String name;
    String department;
    int q1, q2, q3;

    public Student(String name, String department, int q1, int q2, int q3){
        this.name = name;
        this.department = department;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public int getTotal(){
        // return total score
        return 0;
    }
}

public class QuizPerformance {

    static List<Student> records = new ArrayList<>();


    // =========================
    // RECORD
    // =========================
    public static void record(String name, String dept, int q1, int q2, int q3){
    	
    	if(!records.contains(name)) {
    		records.add(new Student(name, dept, q1, q2, q3));
    		System.out.println("Recorded Added: "+name);
    	}
    	else {
    		System.out.println("Student Already Exists");
    	}
    	
    }

     

    // =========================
    // TOP BY DEPARTMENT
    // =========================
    public static void topByDepartment(String dept){
    	
    	List<String> stud = new ArrayList<>();
    	int maxMarks = 0;
    	int total = 0;
    	for(Student s : records) {
    		if(dept.equals(s.department)) {
    			total = s.q1+s.q2+s.q3;
    		}
    		
    		if(total>maxMarks) {
    			maxMarks=total;
    			//stud.add(s.name); 
    			
    			}
    	}
    	int sum = 0;
    	for(Student s : records)
    	{
    		sum = s.q1+s.q2+s.q3;
    		if(sum == maxMarks) {
    			System.out.println(s.name + " "+ maxMarks);
    			
    		}
    	}
      }
    

    	
    	
    	
    	
    	
    	
    

    

    // =========================
    // TOP BY QUIZ
    // =========================
    public static void topByQuiz(String quiz){
    	
    	List<String> ls = new ArrayList<>();
    	int maxMarks = 0;
    	
    	if(quiz.equals("Q1")) {
    	for(Student s : records) {
    			int marks = s.q1; 
    			
    			
    			if(marks>maxMarks) {
    				maxMarks = marks;
    			}
    		}
    	
    	
    	for(Student st : records) {
    		if(maxMarks == st.q1)
    		{
    			ls.add(st.name);
    		}
    	}
    }
    	
    	
       	if(quiz.equals("Q2")) {
        	for(Student s : records) {
        			int marks = s.q2; 
        			
        			
        			if(marks>maxMarks) {
        				maxMarks = marks;
        			}
        		}
        	
        	
        	for(Student st : records) {
        		if(maxMarks == st.q2)
        		{
        			ls.add(st.name);
        		}
        	}
       	}
        	
           	if(quiz.equals("Q3")) {
            	for(Student s : records) {
            			int marks = s.q3; 
            			
            			
            			if(marks>maxMarks) {
            				maxMarks = marks;
            			}
            		}
            	
            	
            	for(Student st : records) {
            		if(maxMarks == st.q3)
            		{
            			ls.add(st.name);
            		}
            	}
           	}
           	
    	for(String s : ls) {
    	System.out.println(s+" "+ maxMarks);

        }
      }
    	
    
    


    // =========================
    // MAIN
    // =========================
    public static void main(String[] args){
    	
    //	Student ob = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
       

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){

            String input = sc.nextLine();

            String[] data = input.split(" ");

            if(data[0].equals("Record")){

                // call record method
            	
            	record(data[1],data[2],Integer.parseInt(data[3]),Integer.parseInt(data[4]),
            			Integer.parseInt(data[5]));

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