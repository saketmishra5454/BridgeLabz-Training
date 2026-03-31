package collectors.employee_salarycategorization;

import java.util.*;
import java.util.stream.*;

public class EmployeeService {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 70000),
                new Employee("Sneha", "HR", 50000),
                new Employee("Amit", "IT", 80000),
                new Employee("Neha", "Finance", 60000),
                new Employee("Vikram", "Finance", 70000)
        );

       Map<String,Double> departmentSalary = employees.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment
                       ,Collectors.averagingDouble(Employee::getSalary)));

       departmentSalary.forEach((dept,salary)-> System.out.println(dept+" -> "+salary));

    }
}
