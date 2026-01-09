import java.util.Scanner;

class Student {       // Student Node class
    int roll;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int roll, String name, int age, char grade) {       // Constructor taking parameters
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentManagementSystem {            // Linked List class
    Student head = null;

    // Insert at beginning
    void insertAtBeginning(int roll, String name, int age, char grade) {
        Student newNode = new Student(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int roll, String name, int age, char grade) {
        Student newNode = new Student(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position
    void insertAtPosition(int roll, String name, int age, char grade, int pos) {
        if (pos == 1) {
            insertAtBeginning(roll, name, age, grade);
            return;
        }
        Student newNode = new Student(roll, name, age, grade);
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete student by roll
    void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.roll == roll) {
            head = head.next;
            System.out.println("Record deleted!");
            return;
        }
        Student temp = head, prev = null;
        while (temp != null && temp.roll != roll) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Record not found!");
            return;
        }
        prev.next = temp.next;
        System.out.println("Record deleted!");
    }

    // Search student by roll
    void searchByRoll(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("\nRecord Found:");
                System.out.println("Roll: " + temp.roll + ", Name: " + temp.name +
                                   ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
    }

    // Update grade by roll
    void updateGrade(int roll, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found!");
    }

    // Display all student records
    void display() {
        if (head == null) {
            System.out.println("No records available!");
            return;
        }
        Student temp = head;
        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name +
                               ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Main menu driver
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem list = new StudentManagementSystem();
        int choice, roll, age, pos;
        String name;
        char grade;

        while (true) {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Insert at Beginning\n2. Insert at End\n3. Insert at Position");
            System.out.println("4. Delete by Roll\n5. Search by Roll\n6. Update Grade");
            System.out.println("7. Display All\n8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.insertAtBeginning(roll, name, age, grade);
                }
                case 2 -> {
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.insertAtEnd(roll, name, age, grade);
                }
                case 3 -> {
                    System.out.print("Enter Roll, Name, Age, Grade & Position: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next().charAt(0);
                    pos = sc.nextInt();
                    list.insertAtPosition(roll, name, age, grade, pos);
                }
                case 4 -> {
                    System.out.print("Enter Roll to Delete: ");
                    roll = sc.nextInt();
                    list.deleteByRoll(roll);
                }
                case 5 -> {
                    System.out.print("Enter Roll to Search: ");
                    roll = sc.nextInt();
                    list.searchByRoll(roll);
                }
                case 6 -> {
                    System.out.print("Enter Roll and New Grade: ");
                    roll = sc.nextInt();
                    grade = sc.next().charAt(0);
                    list.updateGrade(roll, grade);
                }
                case 7 -> list.display();
                case 8 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
