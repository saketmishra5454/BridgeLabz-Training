// Abstract Employee class for shared attributes

import javax.management.relation.Role;

abstract class Employee {

    // final fields -> immutable data for performance & safety
    private final String name;
    private final double salary;

    // Constructor initializes fixed employee details
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods for private fields
    public double getSalary() {
        return salary;
    }

    // Polymorphic bonus method to override in subclasses
    public abstract double getBonus();
}

// Manager: bonus = 10% of salary
class Manager extends Employee {

    // caching computed bonus once (final for performance)
    private final double cachedBonus;

    public Manager(String name, double salary) {
        super(name, salary);
        // bonus calculated only once at construction time
        this.cachedBonus = salary * 0.10;
    }

    @Override
    public double getBonus() {
        return cachedBonus; // returns cached result
    }
}

// Developer: bonus = 5% only if salary > 50000 else 0
class Developer extends Employee {

    // Cached bonus field
    private final double cachedBonus;

    public Developer(String name, double salary) {
        super(name, salary);
        // compute once to avoid repeated calculation
        if (salary > 50000.0) {
            this.cachedBonus = salary * 0.05;
        } else {
            this.cachedBonus = 0.0;
        }
    }

    @Override
    public double getBonus() {
        return cachedBonus; // no extra calculation
    }
}
public class EmployeeRolePolymorphism{
    public static void main(String[] args) {

        // Sample input from question
        Employee manager = new Manager("Alice", 80000);
        System.out.printf("%.2f%n", manager.getBonus()); // Output: 8000.00

        // Test Case 1
        Employee d1 = new Developer("Bob", 60000);
        System.out.printf("%.2f%n", d1.getBonus()); // Expected: 3000.00

        // Test Case 2
        Employee d2 = new Developer("Charlie", 40000);
        System.out.printf("%.2f%n", d2.getBonus()); // Expected: 0.00
    }
}
