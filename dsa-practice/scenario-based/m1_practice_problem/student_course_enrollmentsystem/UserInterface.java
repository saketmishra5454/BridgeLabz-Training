package collections.student_course_enrollmentsystem;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        University university = new University();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("*****************************************");
            System.out.println("1.Add Student\n2.Enroll Course\n3.Remove Student\n4.Display Students\n5.Display Student Courses");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter StudentId and Name");
                    university.addStudent(sc.nextInt(),sc.next());
                    break;

                case 2:
                    System.out.println("Enter StudentId and Course Name");
                    university.enrollCourse(sc.nextInt(),sc.next());
                    break;

                case 3:
                    System.out.println("Enter StudentId to remove");
                    university.removeStudent(sc.nextInt());
                    break;

                case 4:
                    university.displayStudents();
                    break;

                case 5:
                    System.out.println("Enter StudentId");
                    university.displayStudentCourses(sc.nextInt());
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}