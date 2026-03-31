package attendance_tracker;

public class DuplicateAttendanceException extends Exception{
    public DuplicateAttendanceException(String msg){
        super(msg);
    }
}
