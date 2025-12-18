import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();   // Taking input of kilometers by users
         
        
                          

        double miles = kilometers / 1.6;           // Conversion factor from kilometers to miles

        System.out.printf("%.2f kilometers is equal to %.2f miles", kilometers, miles);
    }
}