package leave_management_system;

public class InsufficientLeaveBalanceException extends Exception{
    public InsufficientLeaveBalanceException(String msg){
        super(msg);
    }
}
