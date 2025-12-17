import java.util.Scanner;
public class Main{
        public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();

          if (even(number)){
                System.out.println("The given number is 'EVEN'");
          }
          else{
                System.out.println("The given number is 'ODD'");
         }
         
        }

        public static boolean even(int number){
        return (number%2 == 0);
          
        }
      
      }
