import java.util.Scanner;
public class SalaryAfterBonus {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Create Scanner object
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt(); 
        System.out.print("Enter the no. of year of service: ");
        int yearOfService = sc.nextInt(); 
        

        // Checking whether the number is natural or not
        
        if (yearOfService <= 5) {
            System.out.println("You are not valid to take Bonus");
            System.out.println("So Your Salary Remain Same: "+ salary);

        }
        else {
            
            double bonus = salary*0.05;
            
            double totalSalaryAfterBonus = salary+bonus;
            
                System.out.println("The Total salary is "+ totalSalaryAfterBonus);
            }
        }
}