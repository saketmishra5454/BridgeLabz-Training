//Employee Management System-----Emoployee Records
public class Employee {

    public int employeeID;          // public member
    protected String department;         // protected member
    private double salary;     // private member

    // Constructor
    public Employee(int employeeID, String department, double salary) { // constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {      // getter method for salary
        return salary;
    }

    // Setter
    public void setSalary(double salary) {    // setter method for salary
        this.salary = salary;
    }

    public void displayEmployeeDetails() {      // method to display employee details
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {      // main method

        Employee emp =
                new Employee(301, "IT", 45000);      // creating employee object
        System.out.println("---- Employee Details ----");
        emp.displayEmployeeDetails();

        emp.setSalary(52000);           // updating salary using setter
        System.out.println("\nUpdated Salary: " + emp.getSalary());

        Manager mgr =
                new Manager(401, "HR", 75000, "Senior Manager");
        System.out.println();
        mgr.displayManagerDetails();
    }
}

// Subclass
class Manager extends Employee {

    String designation;

    public Manager(int id, String dept,
                   double salary, String designation) {          // constructor
        super(id, dept, salary);
        this.designation = designation;
    }

    public void displayManagerDetails() {         // method to display manager details
        System.out.println("Manager Details");
        System.out.println("Employee ID : " + employeeID); // public
        System.out.println("Department  : " + department); // protected
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + getSalary()); // private via getter
    }
}
