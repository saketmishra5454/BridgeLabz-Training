import java.util.Scanner;
public class CalSimpleInterest{
    public int calculateInterest(int principal, int rate, int time){
        int interest = (principal * rate * time) / 100;
        return interest;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int principal= sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        CalSimpleInterest obj = new CalSimpleInterest();
        int interest = obj.calculateInterest(principal, rate, time);

        System.out.println("The Simple Interest is "+ interest + " for principal "+ principal + " ,Rate of Interest "+ 
            rate + " and Time "+ time + " years.");
    }
    
}