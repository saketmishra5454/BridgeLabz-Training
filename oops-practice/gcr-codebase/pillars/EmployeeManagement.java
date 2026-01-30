package pillars;
// Interface for department details
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {

    // encapsulated fields
    private int employeeId;
    private String name;
    private double baseSalary;

    // constructor using this
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // abstract method
    public abstract double calculateSalary();

    // concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + calculateSalary());
    }
}

// Full-time employee
class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Main class
public class EmployeeManagement {

    public static void main(String[] args) {

        // polymorphism
        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Riya", 500, 40);

        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("IT");

        Employee[] employees = { e1, e2 };

        // processing employees using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department : " +
                    ((Department) emp).getDepartmentDetails());
            System.out.println();
        }
    }
}
