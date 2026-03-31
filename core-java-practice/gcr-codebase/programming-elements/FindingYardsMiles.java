import java.util.Scanner;
public class FindingYardsMiles {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double feet= sc.nextDouble();                    // Feet given by user 
       
       Double yards = feet/3;           // feet to yards conversion
       
       Double miles = yards/1760;           // yards to miles conversion
    
       

       System.out.println("The Height in feet is"+ feet +" while in yards is"+ yards + " and Miles is "+ miles);

      
    }
}
