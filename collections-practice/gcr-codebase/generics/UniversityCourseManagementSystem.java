import java.util.*;

// Base abstract class for all types of courses
abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // common display info for all child classes
    public abstract void showEvaluationMethod();
}

// Subclass for Exam Based Courses
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void showEvaluationMethod() {
        System.out.println(getCourseName() + " -> Evaluated by Final Exam");
    }
}

// Subclass for Assignment Based Courses
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void showEvaluationMethod() {
        System.out.println(getCourseName() + " -> Evaluated by Assignments");
    }
}

// Subclass for Research Based Courses
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void showEvaluationMethod() {
        System.out.println(getCourseName() + " -> Evaluated by Research Papers & Viva");
    }
}

// Generic Course Management class
// Bounded type: T must extend CourseType
class Course<T extends CourseType> {
    private List<T> courseList;

    public Course() {
        courseList = new ArrayList<>();
    }

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourses() {
        return courseList;
    }
}

// Utility class for displaying courses using Wildcards
class UniversityUtil {

    // wildcard: List<? extends CourseType>
    // means list can be ExamCourse, AssignmentCourse, ResearchCourse, etc.
    public static void displayAllCourses(List<? extends CourseType> list) {
        System.out.println("\n--- Course List Display ---");
        for (CourseType course : list) {
            course.showEvaluationMethod();
        }
    }
}

// Main class to test system 
public class UniversityCourseManagementSystem {
    public static void main(String[] args) {

        // Separate Course Managers for departments
        Course<ExamCourse> examDept = new Course<>();
        Course<AssignmentCourse> assignmentDept = new Course<>();
        Course<ResearchCourse> researchDept = new Course<>();

        // Adding Exam Courses
        examDept.addCourse(new ExamCourse("Mathematics"));
        examDept.addCourse(new ExamCourse("Physics"));

        // Adding Assignment Courses
        assignmentDept.addCourse(new AssignmentCourse("Computer Science Lab"));
        assignmentDept.addCourse(new AssignmentCourse("Data Structures Assignments"));

        // Adding Research Courses
        researchDept.addCourse(new ResearchCourse("AI Research"));
        researchDept.addCourse(new ResearchCourse("Quantum Computing Research"));

        // Display all using Wildcards
        UniversityUtil.displayAllCourses(examDept.getCourses());
        UniversityUtil.displayAllCourses(assignmentDept.getCourses());
        UniversityUtil.displayAllCourses(researchDept.getCourses());
    }
}
