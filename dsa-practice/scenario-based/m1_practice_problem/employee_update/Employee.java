package collections.employee_update;
import java.util.*;

import java.util.ArrayList;

import java.util.List;


public class Employee {
	String name;
	String job;
	String title;
	double salary;
	
	public Employee(String name, String job, String title, double salary) {
		super();
		this.name = name;
		this.job = job;
		this.title = title;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [job=" + job + ", name=" + name + ", salary=" + salary + ", title=" + title + "]";
	}

}

class EmployeeService{
	
	List<Employee> list = new ArrayList<>();
	
	public void addRecord(String name, String job, String title, double salary) {
		
		list.add(new Employee(name,job,title,salary));
		System.out.println("Record Added");
	}
	
	public void updateRecord(String name, String newName)
	{

		boolean found = false;

			for(int i = 0;i<list.size();i++) {
				if (list.get(i).getName().equals(name)) {
					list.get(i).setName(newName);
					found = true;
					break;
				}
			}
			if(found) {
				System.out.println("Record Updated");
			}
			else {
					System.out.println("Employee Name not Found in the data");
				}
	}

	public double calSalary(String name){
		
		for(int i = 0 ;i<list.size();i++) {
			if(list.get(i).getName().equalsIgnoreCase(name)) {
				return list.get(i).getSalary();
			}
		}
		System.out.println("Employee not found");
		return -1;
	}
	
	public void displayDetails() {
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();


		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			 n = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid number entered");
			return;
		}
		
		for(int i = 0; i<n;i++) {
			try{
			System.out.println("take input like:(Operation:name:job:title:salary)");

			String input = sc.nextLine();

			String[] data = input.split(":");


			if (data[0].equals("ADD")) {
				if(data.length!=5){
					throw new IllegalArgumentException("Invalid ADD format");
			}
				service.addRecord(data[1], data[2], data[3], Double.parseDouble(data[4]));
			} else if (data[0].equals("UPDATE")) {

				if(data.length!=3){
					throw new IllegalArgumentException("Invalid Update format");
				}
				service.updateRecord(data[1], data[2]);

			} else if (data[0].equals("CALC")) {
				if (data.length!=2){
					throw new IllegalArgumentException("Invalid CalC format");
				}
				double income = service.calSalary(data[1]);
				System.out.println(income);

			} else if (data[0].equals("DISPLAY")) {
				service.displayDetails();
			} else {
				System.out.println("Plz Enter the Valid Input:");
			}
		}
			catch (NumberFormatException e){
				System.out.println("Salary must be a Valid Number");
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Incorrect input format");
			}
			catch (IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(Exception e){
				System.out.println("Something went wrong");
			}
		}
	}
}


