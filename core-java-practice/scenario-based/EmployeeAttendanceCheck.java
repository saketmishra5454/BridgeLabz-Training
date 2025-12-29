public class EmployeeAttendanceCheck {

    public static void main(String[] args) {

        // program start message 
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        // generating random value for attendance 
        // 0 -> Absent
        // 1 -> Present
        int attendanceCheck = (int) (Math.random() * 2);

        // checking employee attendance 
        if (attendanceCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

