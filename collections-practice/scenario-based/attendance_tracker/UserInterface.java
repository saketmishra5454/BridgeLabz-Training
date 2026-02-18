package attendance_tracker;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    public static void main(String[] args) throws DuplicateAttendanceException {

        AttendanceService attenObj = new AttendanceService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students:");

        int numStudent = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student IDs");

        for(int i = 0 ;i<numStudent;i++){
            String studentIds = sc.nextLine();

            attenObj.addStudent(studentIds);
        }


        System.out.println("Enter number of attendance entries");

        int numAttenEntr = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Attendance Details : ");

        for(int i = 0; i<numAttenEntr;i++){
            String input = sc.nextLine();
            String[] details = input.split(":");

            try {
                attenObj.markAttendance(details[0], details[1]);
            }
        catch(DuplicateAttendanceException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter sessionId to view attendance");

        String sessionToView = sc.next();

        System.out.println("Students present in session " + sessionToView + " are");

        Set<String> attendanceList = attenObj.viewAttendance(sessionToView);


        for (String student : attendanceList) {
            System.out.println(student);
        }

    }
}
