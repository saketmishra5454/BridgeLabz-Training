package collections.key_generation;

import java.util.*;

class KeyGeneration {

    public static boolean isValid(String str) {
    	
    	str = str.toLowerCase();
    	
    	if(str == null) {
    		System.out.println("Invalid Input (empty string)");
    		return false;
    		
    	}
    	
    	else if(str.length()<6) {
    		System.out.println("Invalid Input (length < 6)");
    		return false;
    		 
    	 }
    	
//    	else if(str.contains(" ")) {
//    		System.out.println("Invalid Input (contains space)");
//    		return false;
//    	}
    	
    	   if(str.matches(".*\\s+.*")){
               System.out.println("Invalid Input (contains space)");
               return false;
           }

           if(str.matches(".*\\d+.*")){
               System.out.println("Invalid Input (contains digits)");
               return false;
           }
    	
           
           if(!str.matches("[A-Za-z]+")){
               System.out.println("Invalid Input (contains special character)");
               return false;
           }
           
//    	else if(str.contains("!")||str.contains("@")||str.contains("#")||str.contains("$")
//    			||str.contains("%")||str.contains("^")||str.contains("&")||str.contains("*")
//    			||str.contains("?")||str.contains("-")) {
//    		
//    		System.out.println("Invalid Input (contains special character)");
//    		return false;
//
//    	}
//    	
//    	else if(str.contains("0")||str.contains("1")||str.contains("2")
//    		||str.contains("3")||str.contains("4")||str.contains("5")
//    		||str.contains("6")||str.contains("7")||str.contains("8")
//    		||str.contains("9")) {
//    		
//    		System.out.println("Invalid Input (contains digits)");
//    		
//    		return false;
//
//    	}

        return true;
    }


    public static String generateKey(String str) {
    	StringBuilder sb = new StringBuilder();
    	
    	for(char c:str.toCharArray()) {
    		
    		
    	}
    	
    	return "";
    	
    }
    	
//    	StringBuilder sb = new StringBuilder();
//    	
//    	str = str.toLowerCase();
//    	
//    	for(int i = 0; i<str.length();i++) {
//    		
//    		char ch = str.charAt(i);
//    	
//    	    if((int)ch % 2 != 0) {
//    	    	
//    	    	sb.append(ch);
//    	    
//    	}
//    	    else {
//    	    	continue;
//    	    }
//    		
//    	}
//    	
//    	sb.reverse();
//    	
//    	
//    	StringBuilder strBui = new StringBuilder();
//    	
//    	
//    	for(int i = 0; i<sb.length();i++) {
//    		char c = sb.charAt(i);
//    		if(i%2 == 0) {
//    			char ch = (char)(c-32);
//    			strBui.append(ch);
//    			
//    		}
//    		else {
//    			strBui.append(c);
//    		}
//    	}
//    
//
//        return strBui.toString();
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of String:");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {

            String input = sc.nextLine();

            // validate input
            
            if(isValid(input)) {
            	
            	String str = generateKey(input);
            	if (!str.isBlank()) {
            		System.out.println("The generated key is - "+ str);
            	}
            	
            	else {
            		System.out.println("Invalid Input (empty string)");
            	}
            }
          

        }
    }
}
