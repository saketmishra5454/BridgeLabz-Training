package collectors.student_resultgrouping;

import java.util.*;
import java.util.stream.Collectors;

// Main class
public class StudentGrouping {

    public static void main(String[] args) {

        // List of students
        List<Student> students = Arrays.asList(

                new Student("Rahul", "A"),
                new Student("Saket", "B"),
                new Student("Amit", "A"),
                new Student("Neha", "C"),
                new Student("Vikram", "B")
        );

        Map<String,List<String>> mp = students.stream().collect(Collectors.groupingBy(Student::getGrade
               ,Collectors.mapping(Student::getName,Collectors.toList()))
        );
//         mp.forEach((x,y)->{
//             System.out.println(x+"->"+y);
//         });
        mp.entrySet().forEach(x->System.out.println(x.getKey()+" -> "+ x.getValue()));

























//        // Group students by grade and collect names
//        Map<String, List<String>> groupedByGrade = students.stream()
//                .collect(Collectors.groupingBy(
//                        Student::getGrade,                      // Group by grade
//                        Collectors.mapping(                    // Collect names
//                                Student::getName,
//                                Collectors.toList()
//                        )
//                ));
//
//        // Display result
//        groupedByGrade.forEach((grade, names) -> {
//            System.out.println("Grade " + grade + " : " + names);
//        });
    }
}