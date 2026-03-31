package collections.student_course_enrollmentsystem;

import java.util.*;

public class University {
     
	private Map<Integer,Student> students = new LinkedHashMap<>();
	
	public void addStudent(int id, String name) {
		
		Student existing = students.putIfAbsent(id,new Student(id,name));
		
		if(existing == null) {
			System.out.println("Student Added Successfully");
		}
		else {
			System.out.println("Student Already Exists");
		}
	}
	
	public void enrollCourse(int id,String course) {
		if(students.isEmpty()) {
			System.out.println("No student is Available");
			return;
		}
	    Student existingStudent = students.get(id);
		
		if(existingStudent!=null) {
		existingStudent.getCourses().add(course);
		System.out.println("Course Added Successfully");
		return;
		}
		else {
			System.out.println("Student not found");
		}
	}
	
	public void removeStudent(int id) {
		
		//Iterator<Integer,Student> it = students.iterator();
//		for(Map.Iterator.EntrySet<Integer,Student> entry:students.entrySet().iterator()) {
//			
//		}
		Student removedStudent = students.remove(id);
		if(removedStudent!=null) {
			System.out.println("Studnet Remove Sccessfully");
			
		}
		else {
			System.out.println("Student Not Removed");
		}
		
	}
	
	public void displayStudents() {
		
		if(students.isEmpty()) {
			System.out.println("No Student is Available");
			return;
		}
		
		for(Student student : students.values()) {
			System.out.println("StudentId: "+ student.getStudentId());
			System.out.println("Name: "+ student.getStudentName());
			System.out.println("Course: "+student.getCourses());
			
			System.out.println("------------------------------------------");
		}
	}
	
	public void displayStudentCourses(int id) {
		
		if(students.isEmpty()) {
			System.out.println("No Student is Available");
			return;
		} 
		
		Student studentCourses = students.get(id);
		
		   if(studentCourses == null){
		        System.out.println("Student Not Found");
		        return;
		    }
		
		System.out.println("These are the Courses");
		
		System.out.println(studentCourses.getCourses());
	}
}
		
		
		
	


