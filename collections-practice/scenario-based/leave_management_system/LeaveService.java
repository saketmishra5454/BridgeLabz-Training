package leave_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeaveService {

    private Map<String, Employee> employeeMap = new HashMap<>();


    private List<LeaveRequest> leaveRequestList = new ArrayList<>();



 // Add Employee in the map
    public void addEmployee(Employee employee) {

        if (employee != null && employee.getEmployeeId() != null) {

            employeeMap.put(employee.getEmployeeId(), employee);
        }
    }

// Aplly Leave

//    public void applyLeave(LeaveRequest request) throws InsufficientLeaveBalanceException {
//
//        Employee employee = employeeMap.get(request.getEmployeeId());
//
//        if (employee == null) {
//            return;
//        }
//        int availableBalance = employee.getLeaveBalance();
//        int requestedDays = request.getNumberOfDays();
//
//        if (availableBalance >= requestedDays) {
//            availableBalance -= requestedDays;
//
//            employee.setLeaveBalance(availableBalance);
//
//            request.setStatus("Approved");
//
//            leaveRequestList.add(request);
//
//        } else {
//            request.setStatus("Rejected");
//
//            leaveRequestList.add(request);
//
//           throw new InsufficientLeaveBalanceException( "Insufficient leave balance for employee " + request.getEmployeeId());
//        }
//    }

    public void applyLeave(LeaveRequest request)
            throws InsufficientLeaveBalanceException {

        Employee employee = employeeMap.get(request.getEmployeeId());

        if (employee == null) {
            return;
        }

        int balance = employee.getLeaveBalance();
        int days = request.getNumberOfDays();

        if (balance >= days) {

            employee.setLeaveBalance(balance - days);
            request.setStatus("Approved");

            // ⭐ MUST ADD THIS
            leaveRequestList.add(request);

        } else {

            request.setStatus("Rejected");

            // ⭐ MUST ADD THIS TOO
            leaveRequestList.add(request);

            throw new InsufficientLeaveBalanceException(
                    "Insufficient leave balance for employee "
                            + request.getEmployeeId());
        }
    }


    // Reject leave
    public boolean rejectLeave(String requestId) {

        for (LeaveRequest req : leaveRequestList) {
            if (req.getRequestId().equals(requestId)) {
                req.setStatus("Rejected");
                return true;
            }
        }
        return false;
    }

    //View Leave Request

    public List<LeaveRequest> viewLeaveRequests(){

        return leaveRequestList;

        }






    //Getter And Setter

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public List<LeaveRequest> leaveRequestList(){
        return leaveRequestList;
    }

    public void setLeaveRequestList(List<LeaveRequest> leaveRequestList){
        this.leaveRequestList = leaveRequestList;
    }
}
