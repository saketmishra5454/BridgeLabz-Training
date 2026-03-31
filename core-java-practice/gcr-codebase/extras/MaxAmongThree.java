import java.util.Scanner;
public class MaxAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                // taken input from user
        System.out.println("Enter the Three number:");
		int num1 = 	sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = maxi(num1,num2,num3);
		System.out.println("The Maximum among three is "+result);
	}
	
	public static int maxi(int num1, int num2, int num3) {      // method to find the maximum among three
	   if(num1>num2 && num1>num3) {
		   return num1;          // if num1 is greater
	   }
	   if(num2>num3 && num2>num3) {              // if num2 is greater
		   return num2;
	   }
	   else {  
		   return num3;
	   }
	}
    
}
