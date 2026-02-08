import java.util.*;
import java.util.stream.Collectors;

// Student class
class Student {

    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

// Main class
public class StudentGrouping {

    public static void main(String[] args) {

        // List of students
        List<Student> students = Arrays.asList(

                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Emma", "B"),
                new Student("Frank", "A")
        );

        // Group students by grade and collect names
        Map<String, List<String>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,                      // Group by grade
                        Collectors.mapping(                    // Collect names
                                Student::getName,
                                Collectors.toList()
                        )
                ));

        // Display result
        groupedByGrade.forEach((grade, names) -> {
            System.out.println("Grade " + grade + " : " + names);
        });
    }
}