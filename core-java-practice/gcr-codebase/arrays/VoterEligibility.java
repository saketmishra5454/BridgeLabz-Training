import java.util.Scanner;
public class VoterEligibility {

  	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[10];             // array to store age of 10 students
	    for(int i = 0; i<10;i++){         // loop for 10 students
	        System.out.println("Enter the age of the "+ (i+1) +" Student");
	        arr[i] = sc.nextInt();
	    
	    
	    if(arr[i]<0){         // condition for negative age
	        System.out.println("Plz enter the valid age.");
	    }
	    else if(arr[i]<18){     // condition for age less than 18
	        System.out.println("Student "+ (i+1) +" can't Vote");
	    }
	    
	    else if(arr[i]>=18){            // condition for age 18 or more
	        
	        System.out.println("Student "+ (i+1) +" can Vote");
	    }
	    }
        sc.close();
	}
}
