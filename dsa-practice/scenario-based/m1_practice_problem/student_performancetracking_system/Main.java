package collections.student_performancetracking_system;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentPlatform platform = new StudentPlatform();
        
        System.out.println("Enter the Number of Operation you want:");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
        	
        	System.out.println("1.Add Student\n2.Remove Student\n3.Add Marks\n4.Calculate Average\n5.Find Topper Student\n6.Display");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                	System.out.println("Enter the Student Name want to add");
                    String name = sc.nextLine();
                    platform.addStudent(name);
                    break;

                case 2:
                	System.out.println("Enter the Student Name want to Delete:");
                    String removeName = sc.nextLine();
                    platform.removeStudent(removeName);
                    break;

                case 3:
                	System.out.println("Enter the Student Name and Marks Like(Name,Marks)");
                    String studentName = sc.nextLine();
                    int marks = sc.nextInt();
                    platform.addMarks(studentName, marks);
                    break;

                case 4:
                	System.out.println("Enter the student name want to see the Average Marks:");
                    String avgName = sc.nextLine();
                    platform.calculateAverageMarks(avgName);
                    break;

                case 5:
                	System.out.println("This the Topper Student:");
                    platform.findTopStudent();
                    break;

                case 6:
                	System.out.println("The Student Data are:");
                    platform.displayStudents();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}