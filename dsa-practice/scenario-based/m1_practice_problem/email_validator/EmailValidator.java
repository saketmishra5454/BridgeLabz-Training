package collections.email_validator;

import java.util.*;

public class EmailValidator {
	
	
	public void emailvalid(String s) {
		if(s.matches("^[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com$")) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		EmailValidator email = new EmailValidator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Take input Operations");
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n;i++) {
			String s = sc.nextLine();
			
			email.emailvalid(s);
		}		
	}

}



