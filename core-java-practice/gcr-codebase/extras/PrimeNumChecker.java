import java.util.Scanner;

public class PrimeNumChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter : ");
        int num = sc.nextInt();
        primeChecker(num);

    }
    public static void primeChecker(int a){
        if(a<2){
            System.out.println("The num is not prime");
        }
        else{
        for(int i = 2; i<=a/2;i++){
            if(a%i==0){
                System.out.println("The number is not Prime");
                return;
            }
        }
            
       System.out.println("The number is a Prime");
        
        
    }
    }
    
}
