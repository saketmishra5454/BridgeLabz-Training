package collections.course_enrollmentsystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		CoursePlatform course = new CoursePlatform();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Operations:");
		int n = sc.nextInt();
		
		
		for(int i = 0; i<n;i++) {
			System.out.println("1.Add Student\n2.Add Marks\n3.FindTop 3 Students\n4.Display All Students");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter the name of the Student want to Add");
				course.addStudent(sc.next());
				break;
				
			case 2:
				System.out.println("Enter the Student name and Marks like (Name,Marks)");
				String name = sc.next();
				int marks = sc.nextInt();
				course.addMarks(name, marks);
				break;
				
			case 3:
				System.out.println("These are the 3 Toppers");
				System.out.println();
				course.findTop3Students();
				break;
				
			case 4:
				System.out.println("These are the Details of the Students:");
				System.out.println();
				course.displayStudents();
				break;
				
			default:
					System.out.println("Invalid Entry");
			}
		}
		sc.close();
	}

}
