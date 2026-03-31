package collections.course_enrollmentsystem;

import java.util.*;

class CoursePlatform {

    private Map<String, Student> students = new LinkedHashMap<>();

    public void addStudent(String name){
        // write logic
    	Student existing = students.putIfAbsent(name, new Student(name));
    	if(existing==null) {
    		System.out.println("Student Added Successfully");
    	}
    	else {
    		System.out.println("Student Aready Exists");
    	}
    }

    public void addMarks(String name,int marks){
        // write logic

		Student student = students.get(name);

		if(student != null){
			student.getMarks().add(marks);
			System.out.println("Marks Added Successfully");
		}
		else {
			System.out.println("Student not found");
		}
    }
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

    public void findTop3Students() {
        // HARD METHOD
    	
    	if(students.isEmpty()) {
    		System.out.println("No Student is Available");
    		return;
    	}
    	
    	List<Student> validStudents = new ArrayList<>();
    	
    	for(Student student : students.values()) {
    		
//    		if(student == null) {
//    			System.out.println("No Marks Yet");
//    			return;
//    		}
    		
    		
    		if(student.getMarks().isEmpty()) {
    			continue;
    		}
    		
    		validStudents.add(student);
    			
    	}
    	
    	if(validStudents.isEmpty()) {
    		System.out.println("No Ranked Students Available");
    		return;
    	}
    	
    	Collections.sort(validStudents,(s1,s2)->{
    		double avg1 = s1.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
    		double avg2 = s2.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
    		
    		return Double.compare(avg2,avg1);
    	});
    	
    	
         int limit = Math.min(3,validStudents.size());
         
         for(int i = 0; i<limit;i++) {
        	 
        	 Student student = validStudents.get(i);
        	 
        	 double avg = student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0);
        	 
        	 
        	 System.out.println((i+1)+" Rank: "+ student.getName());
        	 System.out.println("Average Marks: "+avg);
        	 System.out.println("----------------------------------");
    	

        }
    }
   

    public void displayStudents(){
        // write logic
		for(Student student: students.values()){
			System.out.println("Student Name: "+student.getName());
			System.out.println("Marks obtained: "+student.getMarks());

			System.out.println("------------------------------------------");
		}
    }
}