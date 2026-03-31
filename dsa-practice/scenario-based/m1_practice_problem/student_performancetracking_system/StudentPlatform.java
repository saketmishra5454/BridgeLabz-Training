package collections.student_performancetracking_system;

import java.util.*;

class StudentPlatform {

    private Map<String, Student> students = new LinkedHashMap<>();

    public void addStudent(String name) {
        // write logic
    	 Student existing = students.putIfAbsent(name, new Student(name));
    	 
    	 if(existing==null) {
    		 System.out.println("Student Added Successfully");
    	 }
    	 else {
    		 System.out.println("Student Already Exists");
    	 }
    }

    public void removeStudent(String name) {
        // write logic
    	Student removed = students.remove(name);
    	
    	if(removed!=null) {
    		System.out.println("Student Removed Successfully");
    	}
    	else {
    	System.out.println("Student Not Found");
    	}
    }

    public void addMarks(String name, int marks) {
        // write logic
    	Student stud = students.get(name);
    	
    	if(stud==null) {
    		System.out.println("Student Not Found");
    		return;
    	}
    	
    	else{
    	stud.getMarks().add(marks);
    	System.out.println("Marks Added Successfully");
    }
    }

    public void calculateAverageMarks(String name) {
        // write logic
    	Student student = students.get(name);
    	
    	if(student==null) {
    		System.out.println("No Student is Available With the Given Name");
    		return;
    	}
    	
    	List<Integer> marks = student.getMarks();
    	
    	if(marks.isEmpty()){
    	    System.out.println("No Marks Available");
    	    return;
    	}
    	
    	double sum = 0;
    	
    	for(int mark:marks) {
    		sum+=mark;
    	}
    	double avgMarks = sum/marks.size();
    	
    	System.out.println("The Average Marks for '"+ student.getName()+"' is :"+avgMarks);
    }

    public void findTopStudent() {
        // write logic
    	
    	if(students.isEmpty()) {
    		System.out.println("No Student is Found");
    		return;
    	}
    	
//    	for(Student stud : students.values()) {
//		
//	}
    	
    	double maxMarks = 0;
		String topper = null;
    	
    	for(Map.Entry<String,Student> entry : students.entrySet()) {
    		Student student = entry.getValue();
    		
    
    		
    		List<Integer> marks = student.getMarks();
    		
    		if(marks.isEmpty()) {
//    			System.out.println("No Marks Yet");
//    			return;
    			continue;
    		}
    		
    		double total = 0;
    		for(int mark : marks) {
    			total+=mark;
    		}
    		double avgMarks = total/marks.size();
    	
    
    		if(avgMarks>maxMarks) {
    			maxMarks = avgMarks;
    			topper = student.getName();
    		}
    	}
    		
    	
    	if(topper != null) {
    		System.out.println("Topper Student :"+ topper);
        	System.out.println("Average Marks :"+ maxMarks);
    		
    	}
    	else {
    		System.out.println("No Topper is Found");
    	}
    	
    }
    
    

    public void displayStudents() {
        // write logic
    	
    	for(Student student : students.values()) {
    		
    		System.out.println("Student Name :"+student.getName());
    		System.out.println("Marks :" + student.getMarks());
    	}
    	
    }
}
