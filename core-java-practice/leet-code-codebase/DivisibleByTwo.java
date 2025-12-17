import java.util.Scanner;
public class DivisibleByTwo{
          public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          
          if(divisible(number)){
                  System.out.println("YES, the given number is divisible by 2");
          }
          else{
                 System.out.println("NO, the given number is not divisible by 2");

           }
                    
}
          public static boolean divisible(int number){
          return (number%2 == 0);
}

           }