package collections.student_performance_analyzer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Analyzer analyzer = new Analyzer();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("****************************************");
            System.out.println("1.Add Student\n2.Add Marks\n3.Calculate Average\n4.Display Top Students\n5.Display Students");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter StudentId and Name");
                    analyzer.addStudent(sc.nextInt(),sc.next());
                    break;

                case 2:
                    System.out.println("Enter StudentId and Marks");
                    analyzer.addMarks(sc.nextInt(),sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter StudentId");
                    analyzer.calculateAverage(sc.nextInt());
                    break;

                case 4:
                    analyzer.displayTopStudents();
                    break;

                case 5:
                    analyzer.displayStudents();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}