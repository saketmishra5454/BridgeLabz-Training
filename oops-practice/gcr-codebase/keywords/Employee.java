public class Employee {

    // static variable shared by all employees
    static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;

    // instance variables
    String name;
    String designation;

    // final variable 
    final int id;

    // constructor using this keyword
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; // counting employees
    }

    // static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Employees: " + totalEmployees);
    }

    // instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    // main method
    public static void main(String[] args) {

        // creating employee objects
        Employee e1 = new Employee(101, "Abhishek Sharma", "Software Engineer");
        Employee e2 = new Employee(102, "Saket Mishra", "Project Manager");

        // displaying total employees
        Employee.displayTotalEmployees();

        // checking instance before displaying details
        if (e1 instanceof Employee) {
            e1.displayEmployeeDetails();
        }

        System.out.println();

        if (e2 instanceof Employee) {
            e2.displayEmployeeDetails();
        }
    }
}
