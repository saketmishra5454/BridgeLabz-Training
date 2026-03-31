package StudentRegistrationSystem;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person{         //Student extends the Person class
	private List<String> enrolledCourses;
	private double gpa;
	
	public Student(String name,String id) {          // values are given to variables
		super(name,id);
		this.enrolledCourses = new ArrayList<>();
		this.gpa = 0.0;
	}
	public void addCourse(String courseName) {        // method to add Courses in ArrayList
		enrolledCourses.add(courseName);
	}
	public List<String> getEnrolledCourses() {      //Method to get the EnrolledCourses
		return enrolledCourses;
	}

}
