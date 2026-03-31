package collections.M1_Practice.set3.email_access_control;

import java.util.Scanner;

public class EmailValidator {
	
	public static boolean isValid(String str) {
		
		if(str == null || str.trim().isEmpty()) {
			return false;
		}
		
		if(!str.matches("^[a-z]{3,}\\.[a-z]{3,}\\d{4}@(sales|IT|marketing|product).company.com$")) {
			return false;
			
		}
		else {
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("ENter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			
			String input = sc.next();
		
		
		if(isValid(input)) {
			System.out.println("Access Granted");
			
		}
		else {
			System.out.println("Access Denied");
		}
		}
	}

}
