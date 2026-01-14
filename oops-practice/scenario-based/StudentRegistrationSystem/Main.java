package StudentRegistrationSystem;

public class Main {
	public static void main(String[] args) {
		RegistrationService service = new RegistrationManager();
		Student s1 = new Student("Mahendra Singh Dhoni","S0007");
		RegistrationManager rm = new RegistrationManager();
		try {
		   rm.enroll(s1,"Computer Science Engineering");
		   rm.enroll(s1,"C++");
		   rm.enroll(s1,"Java Programming");
		   rm.enroll(s1,"Python");
		  
		   
		}catch(CourseLimitExceededException obj){ 
			System.out.println("Error: "+ obj.getMessage());
		}
		//service.enroll(s1, "Java Programming");
		 rm.drop(s1,"C++");
		
	}

}
