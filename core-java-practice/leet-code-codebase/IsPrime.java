import java.util.*;
public class Main{
         public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         
    
      if(number<=1){
        System.out.println("No, the given number is not a Prime no.");
        return;
      }
      else{
        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number%i == 0){
                System.out.println("No, the given number is not a Prime no.");
                return;
            }
            
        }
      }
       System.out.println("Yes ,the given number is a Prime no.");

    }
}

