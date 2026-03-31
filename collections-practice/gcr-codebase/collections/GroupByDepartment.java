import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}


public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee e : employees) {
            // if dept not there then create new list
            grouped.putIfAbsent(e.department, new ArrayList<>());
            grouped.get(e.department).add(e);
        }

        // printing grouped results
        for (String dept : grouped.keySet()) {
            System.out.print(dept + ": ");
            List<Employee> list = grouped.get(dept);
            for (Employee emp : list) {
                System.out.print(emp.name + " ");
            }
            System.out.println();
        }
    }
}
