package attendance_tracker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AttendanceService {

    private Set<String> studentSet = new HashSet<>();


    private Map<String, Set<String>> attendanceMap = new HashMap<>();


    public void addStudent(String studentId){
        studentSet.add(studentId);
    }

    public void markAttendance(String sessionId, String studentId)
            throws DuplicateAttendanceException {

        // If session does not exist, create new entry
        attendanceMap.putIfAbsent(sessionId, new HashSet<>());

        // Now get the set
        Set<String> students = attendanceMap.get(sessionId);

        // Check duplicate
        if (students.contains(studentId)) {
            throw new DuplicateAttendanceException(
                    "Attendance already marked for student '"
                            + studentId + "' in session '" + sessionId + "'");
        }

        // Add student
        students.add(studentId);
    }


    public boolean removeAttendance(String sessionId, String studentId){
        if(attendanceMap.get(sessionId) != null){
            if(attendanceMap.get(sessionId).contains(studentId)) {
                attendanceMap.get(sessionId).remove(studentId);
                return true;
            }

        }

        else{
            return false;
        }
        return false;
    }

    public Set<String> viewAttendance(String sessionId){

        if (attendanceMap.containsKey(sessionId)){
            return attendanceMap.get(sessionId);
        }

        return new HashSet<>();
    }
















    public Set<String> getStudentSet() {
        return studentSet;
    }

    public Map<String, Set<String>> getAttendanceMap() {
        return attendanceMap;
    }

    public void setAttendanceMap(Map<String, Set<String>> attendanceMap) {
        this.attendanceMap = attendanceMap;
    }

    public void setStudentSet(Set<String> studentSet) {
        this.studentSet = studentSet;
    }
}
