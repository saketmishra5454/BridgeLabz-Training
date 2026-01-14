package StudentRegistrationSystem;

public class CourseLimitExceededException extends Exception{     // Exception Handling: Custom Exception
	public CourseLimitExceededException(String msg) {
		super(msg);
	}

}
