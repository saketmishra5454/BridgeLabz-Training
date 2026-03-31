package collections.student_performancetracking_system;

import java.util.*;

class Student {

    private String name;
    private List<Integer> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
