package collections.M1_Practice.set2.key_generation;

import java.util.*;

public class KeyGeneration {
	
	public static boolean isValid(String str) {
     
	 // str = str.toLowerCase();
	  
	  if(str == null || str.isEmpty()) {
		    System.out.println("Invalid Input (empty string)");
		    return false;
		}

		str = str.toLowerCase();
	  
	  if(str.length()<6) {
		  System.out.println("Invalid Input (length < 6)");
		  return false;
	  }
	  
	  if(str.matches(".*\\s+.*")){
		  System.out.println("Invalid Input (contains space)");
		  return false;
	  }
	  
	  if(str.matches(".*\\d+.*")) {
		  System.out.println("Invalid Input (contains digits)");
		  return false;
	  }
	  
	  if(!str.matches("[A-Za-z]+")) {
		  System.out.println("Invalid Input (contains special character)");
		  return false;
		  
	  }
	  
	  return true;
		
	}
	
	public static String generateKey(String str) {
		
	str = str.toLowerCase();
	
	StringBuilder sb = new StringBuilder();
	
	for(int i = 0; i<str.length();i++) {
		char c = str.charAt(i);
		if(c%2 != 0) {
			sb.append(c);
		  
		} 
		
	}
	
	sb.reverse();
	
	StringBuilder result = new StringBuilder();
	for(int i = 0; i<sb.length();i++) {
		if(i%2 == 0) {
			//int ascii = sb.toString().charAt(i);
			char ch = Character.toUpperCase(sb.charAt(i));                          //(char)(ascii-32);                 
			result.append(ch);
		}
		else {
		result.append(sb.charAt(i));
	}
	}
	
	return result.toString();
	
	
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static String generateKey(String str) {
//		StringBuilder sb = new StringBuilder();
//		
//		str = str.toLowerCase();
//		
//		for(int i = 0; i<str.length();i++) {
//		    char c = str.charAt(i);
//
//			if(c%2 != 0) {
//				sb.append(c);
//			}
//			
//		}
//		
//		 sb.reverse();
//		
//		StringBuilder result = new StringBuilder();
//		
//		//for(char ch : sb.toString().toCharArray()){
//		for(int i = 0; i<sb.length();i++) {
//			if(i%2 == 0) {
//				result.append(Character.toUpperCase(sb.charAt(i)));
//			}
//			else {
//			result.append(sb.charAt(i));
//			
//		}
//		}
//		return result.toString();
//	}
//	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		for(int i = 0; i<n;i++) {
			String input = sc.nextLine();
		
		
		if(isValid(input)) {
			String str = generateKey(input);
			
			if(!str.isBlank()) {
			System.out.println("The generated key is -"+generateKey(input));
			}
			else {
			    System.out.println("Invalid Input (empty string)");

			}
			
			
		}
		
		}
		
		
	}

}
