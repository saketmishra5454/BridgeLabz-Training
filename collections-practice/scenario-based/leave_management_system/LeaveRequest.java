package leave_management_system;

public class LeaveRequest {
    private String requestId;
    private String employeeId;
    private int numberOfDays;
    private String reason;
    private String status;

    public LeaveRequest(String requestId, String employeeId, int numberOfDays, String reason, String status) {
        this.employeeId = employeeId;
        this.numberOfDays = numberOfDays;
        this.reason = reason;
        this.requestId = requestId;
        this.status = status;
    }

    //Getter And Setter

    public String getRequestId(){
        return requestId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setRequestId(String requestId){
        this.requestId = requestId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
