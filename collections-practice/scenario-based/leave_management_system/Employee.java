package leave_management_system;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String department;
    private int leaveBalance;

    public Employee( String employeeId, String employeeName,String department, int leaveBalance) {
        this.department = department;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.leaveBalance = leaveBalance;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeNamel() {
        return employeeName;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeNamel(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
}
