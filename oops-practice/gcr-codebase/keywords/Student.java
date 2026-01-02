public class Student {

    // static variable shared by all students
    static String universityName = "GLA University";
    static int totalStudents = 0;

    // instance variables
    String name;
    String grade;

    // final variable (cannot be changed)
    final int rollNumber;

    // constructor using this keyword
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // count students
    }

    // static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }

    // method to display student details
    public void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // main method
    public static void main(String[] args) {

        // creating student objects
        Student s1 = new Student(101, "Saket Mishra", "A");
        Student s2 = new Student(102, "Abhishek", "B");

        // displaying total students
        Student.displayTotalStudents();

        // checking instanceof before operations
        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        System.out.println();

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        System.out.println();

        // updating grade after validation
        if (s2 instanceof Student) {
            s2.updateGrade("A");
            s2.displayStudentDetails();
        }
    }
}

