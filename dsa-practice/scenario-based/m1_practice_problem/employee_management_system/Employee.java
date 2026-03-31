package collections.employee_management_system;

class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}