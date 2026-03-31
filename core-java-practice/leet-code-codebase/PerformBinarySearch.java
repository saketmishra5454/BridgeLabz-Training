import java.util.Scanner;
public class PerformBinarySearch
{
	public static void main(String[] args) {
	    int arr[] = {2,3,4,6,7,9,10,13,14,16,17,18};
	   // int num = 13;
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int li = 0;
	    int hi = arr.length-1;
	    int mi = (li+hi)/2;
	    
	    while(li<=hi){
	    if(arr[mi] == num){
	        
		System.out.println("The Given no. is found at '" + mi +"' indexed position.");
		break;
	    }
	    else if(arr[mi]<num){
	        li = mi+1;
	    }
	    else{
	        hi = mi-1;
	    }
	    mi =  (li+hi)/2;
	    }
	    if(li>hi)
	    System.out.println("number is not found");
	    
	    
	}
}
