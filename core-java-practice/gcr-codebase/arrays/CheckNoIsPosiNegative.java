import java.util.Scanner;
public class CheckNoIsPosiNegative
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[5];
	    for(int i = 0; i<5;i++){
	        System.out.println("Enter the "+ (i+1) +" Number");
	        arr[i] = sc.nextInt();
        
	    if(arr[i]==0){
	        System.out.println("The number is 0.");
	    }
	    else if(arr[i]<0){
	        System.out.println("The number is Negative");
	    }
	    
	    else if(arr[i]>0){
	        System.out.println("The number is positive");
	        if(arr[i]%2 == 0){
	        System.out.println("And also a EVEN number");
	        }
	        else{
	            System.out.println("And also a ODD number");
	        }
	    }
	}
	if(arr[0] == arr[arr.length-1]){
	        System.out.println("The First and Last elements of the Array is Equal");
	    }
	    else if(arr[0] > arr[arr.length-1]){
	        System.out.println("The First Element is Greater");
	    }
	    else{
	        System.out.println("The Last Element is Greater");
	    }
}
}
