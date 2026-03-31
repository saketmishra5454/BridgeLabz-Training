package collections.student_performance_analyzer;

import java.util.*;

class Student {

    private int studentId;
    private String studentName;
    private List<Integer> marks;

    public Student(int studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = new ArrayList<>();
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public List<Integer> getMarks(){
        return marks;
    }
}