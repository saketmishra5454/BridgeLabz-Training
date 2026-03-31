package collections.student_performance_analyzer;

import java.util.*;

class Analyzer {

    private Map<Integer,Student> students = new LinkedHashMap<>();

    public void addStudent(int id,String name){
        // write logic
    	
    	Student add = students.putIfAbsent(id,new Student(id,name));
    	if(add==null) {
    		System.out.println("Student added successfully");
    	}
    	else {
    		System.out.println("Student Exists Already");
    	}
    }

    public void addMarks(int id,int marks){
        // write logic
    	Student st = students.get(id);
    	if(st == null) {
    		System.out.println("Student not found");
    		return;
    	}
    	else {
    		st.getMarks().add(marks);
    		System.out.println("Marks Added Successfully");
    	}
    }

    public void calculateAverage(int id){
        // write logic
    	
    	Student student = students.get(id);
    	if(student == null) {
    		System.out.println("Student not Found");
    		return;
    	}
    	
    	List<Integer> marks = student.getMarks();
    	
    	if(marks.isEmpty()) {
    		System.out.println("No Marks yet");
    		return;
    	}
    	
    	double sum = 0;
    	for(int i : marks) {
    		sum+=i;
    	}
    	
    	double avg = sum/marks.size();
    	
    	System.out.println("The Average marks of "+student.getStudentName()+ " is: "+avg);
    }

    public void displayTopStudents(){
        // write logic
    	
    	if(students.isEmpty()) {
    		System.out.println("No Student is Found");
    		return;
    	}
    	
    	double maxAvg = 0;
		String topStudent = null;
    	for(Student student:students.values()) {
    		
    		if(student==null) {
    			continue;
    		}
    		
    		
    		List<Integer> marks = student.getMarks();
    		
    		if(marks.isEmpty()) {
    			continue;
    		}
    		
    		double sum = 0;
    		for(int i:marks) {
    			sum+=i;
    		}
    		double avg = sum/marks.size();
    		
    		if(avg>maxAvg) {
    			maxAvg = avg;
    			topStudent = student.getStudentName();
    			
    		}
    	}
    		
    		if(topStudent != null) {
    			System.out.println("Topper Name is: "+ topStudent);
    			System.out.println("With Average Marks is: "+ maxAvg);
    		}
    		else {
    			System.out.println("Topper not found");
    		}
    }
    
    
    public void findTop3Student() {
    	if(students.isEmpty()) {
    		System.out.println("No Student is Available");
    		return;
    	}
    	
    	List<Student> validStudent = new ArrayList<>();
    	
    	for(Student st : students.values()) {
    	
    		
    		if(st.getMarks().isEmpty()) {
    			continue;
    		}
    	
    		validStudent.add(st);
    	}
    		
    		if(validStudent.isEmpty()) {
        		System.out.println("No Ranked Students Available");
        		return;
        	}
    		
    		Collections.sort(validStudent,(s1,s2)->{
        		double avg1 = s1.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
        		double avg2 = s2.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
        		
        		return Double.compare(avg2,avg1);
        	});
        	
        	
             int limit = Math.min(3,validStudent.size());
             
             for(int i = 0; i<limit;i++) {
            	 
            	 Student student = validStudent.get(i);
            	 
            	 double avg = student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
            	 
            	 
            	 System.out.println((i+1)+" Rank: "+ student.getStudentName());
            	 System.out.println("Average Marks: "+avg);
            	 System.out.println("----------------------------------");
        	

            }
    }

    public void displayStudents(){
        // write logic
    	
    	for(Student st : students.values()) {
    		
    		if(st == null) {
    			continue;
    		}
    		else {
    			System.out.println("Student id: "+st.getStudentId());
    			System.out.println("Name: "+ st.getStudentName());
    			System.out.println("Marks: "+ st.getMarks());
    			System.out.println("---------------------------------");
    		}
    	}
    }
}