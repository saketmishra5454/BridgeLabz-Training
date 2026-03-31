package StudentRegistrationSystem;


public class RegistrationManager implements RegistrationService{         //class RegistrationManager implements the RegistrationService interface 
	private final int MAX_COURSES = 3;
	 public void enroll(Student student, String courseName) throws CourseLimitExceededException{
		 if(student.getEnrolledCourses().size()>= MAX_COURSES) {
			 throw new CourseLimitExceededException("Student "+ student.getName()+ " reached the Limit");
		 }
		 
		 //Add Student in Course Name
		 student.addCourse(courseName);
		 System.out.println("Enrolled "+ student.getName() + " in "+ courseName);
	 }
	 
	 // Method to drop or delete the course for the particular student
	 public void drop(Student student, String courseName) {
		 student.getEnrolledCourses().remove(courseName);
		 System.out.println("Dropped "+ courseName + " for "+ student.getName());
	 }
	 

}
