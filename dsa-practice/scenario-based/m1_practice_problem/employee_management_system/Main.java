package collections.employee_management_system;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Company company = new Company();
        
        System.out.println("Enter the Operations you want");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
        	
        	System.out.println("1.Add Employee\n2.Remove Employee\n3.Search Employee\n4.Update Salary\n5.Display Employees");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                	System.out.println("Enter the Employee want to add like (id,name,salary)");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    double salary = sc.nextDouble();
                    company.addEmployee(new Employee(id,name,salary));
                    break;

                case 2:
                	System.out.println("Enter the EmployeeId want to Remove");
                    company.removeEmployee(sc.nextInt());
                    break;

                case 3:
                	System.out.println("Enter the EmployeeId want to Search");
                    company.searchEmployee(sc.nextInt());
                    break;

                case 4:
                	System.out.println("Enter the EmployeeId want to update the salary");
                    int empId = sc.nextInt();
                    double newSalary = sc.nextDouble();
                    company.updateSalary(empId,newSalary);
                    break;

                case 5:
                	System.out.println("These are the Details of the Employee:");
                	System.out.println();
                    company.displayEmployees();
                    break;
            }
        }
    }
}