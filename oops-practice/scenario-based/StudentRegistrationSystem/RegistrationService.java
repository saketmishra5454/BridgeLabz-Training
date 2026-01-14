package StudentRegistrationSystem;


//Abstraction: This defines the "Rules" of the system
public interface RegistrationService {
	void enroll(Student student, String courseName) throws CourseLimitExceededException;
	void drop(Student student, String courseName);

}
