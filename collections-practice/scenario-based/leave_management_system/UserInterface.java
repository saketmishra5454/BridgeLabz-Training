package leave_management_system;

import javax.naming.InsufficientResourcesException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        LeaveService service = new LeaveService();

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter number of employees");

        int numOfEmp = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Employee details {in the format -> (id:name:department:leaveBalance)}");

        for (int i = 0; i<numOfEmp; i++) {
            String empDetails = sc.nextLine();

            String[] details = empDetails.split(":");
            Employee emp = new Employee(details[0], details[1], details[2], Integer.parseInt(details[3]));
            service.addEmployee(emp);
        }

        System.out.println("Enter number of leave requests");
        int numOfLeave = Integer.parseInt(sc.nextLine());

        System.out.println("Enter leave request details {in the format -> (requestId:empId:numOfDays:reason)}");

        for(int i = 0; i<numOfLeave;i++){
            String leaveDetails = sc.nextLine();

            String[] data = leaveDetails.split(":");

            LeaveRequest leReq = new LeaveRequest(data[0],data[1],Integer.parseInt(data[2]),data[3],"Pending");

            try{
                service.applyLeave(leReq);
            }
            catch (InsufficientLeaveBalanceException e){
                System.out.println(e.getMessage());

            }
        }

        System.out.println("Leave Requests");

        List<LeaveRequest> list = service.viewLeaveRequests();

        //System.out.println(list.size());


        for(LeaveRequest req : list){
            System.out.println(
                    req.getRequestId() + " | " + req.getEmployeeId() + " | " + req.getNumberOfDays() + " days | " + req.getStatus()
            );
        }
    }
}
