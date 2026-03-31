package collections.employee_management_system;

import java.util.*;

class Company {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        for(Employee emp : employees) {
        	if(emp.getEmployeeId() == employee.getEmployeeId()) {
        		System.out.println("Employee Already Exists");
        		return;
        	}
        }
        employees.add(employee);
        System.out.println("Employee Added Successfully");
    }


    public void removeEmployee(int employeeId){
    	Iterator<Employee> it = employees.iterator();
        
    	while(it.hasNext()) {
    		Employee remove = it.next();
    		if(remove.getEmployeeId()==employeeId) {
    			it.remove();
    			System.out.println("Employee Removed Successfully");
    		}
    		else {
    		System.out.println("Employee not found");
    		}
    	}
    }

    public void searchEmployee(int employeeId){
    	
    	if(employees.isEmpty()) {
    		System.out.println("No Employee is Available");
    		return;
    	}
    	
    	boolean flag = false;
    	
    	for(int i = 0;i<employees.size();i++){
        Employee employee = employees.get(i) ;
        
        
        if(employee.getEmployeeId() == employeeId) {
        	System.out.println("EmployeeName: "+ employee.getEmployeeName());
        	System.out.println("Salary: "+employee.getSalary());
        	flag = true;
        } 
    }
    if(!flag) {
        	System.out.println("No Employee Found");
            }
    }

    public void updateSalary(int employeeId, double newSalary){
    	
    	if(employees.isEmpty()) {
    		System.out.println("No Employee is available");
    		return;
    	}
    
    	boolean flag = false;
        for(int i = 0;i<employees.size();i++) {
        	Employee emp = employees.get(i);
        	
        	if(emp.getEmployeeId() == employeeId) {
        		emp.setSalary(newSalary);
        		System.out.println("Employee Salary is Updated Successfully");
        		flag = true;
        		
        	}
        }
        	
        if(!flag) System.out.println("No Employee is found with the Given employeeId");
        
        }

    public void displayEmployees(){
    	for(Employee emp : employees) {
    	    System.out.println("Employee Id: "+emp.getEmployeeId());
    	    System.out.println("Employee Name: "+ emp.getEmployeeName());
    	    System.out.println("Employee Salary: "+ emp.getSalary());
    	    System.out.println("-------------------------------------------");
    	}
    }
}