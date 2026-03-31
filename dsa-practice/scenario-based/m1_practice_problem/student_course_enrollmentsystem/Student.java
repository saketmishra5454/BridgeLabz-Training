package collections.student_course_enrollmentsystem;

import java.util.*;

public class Student {

	private int studentId;
	private String studentName;
	private List<String> courses;
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		courses = new ArrayList<>();
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public List<String> getCourses(){
		return courses;
	}
}
