import java.util.Scanner;
public class VoteEligibility {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input the age of user
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if (age>=18){                   // checking the age for voting eligibility
            System.out.println("The person age is "+ age + " and can vote");
        }
        else{
            System.out.println("The person age is "+ age + " and can not vote");
        }
        

        // Output


        
    }
}

