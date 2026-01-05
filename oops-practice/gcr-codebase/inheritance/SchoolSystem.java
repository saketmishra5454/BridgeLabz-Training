//Program to demonstrate Inheritance in a School System
class Person{
    String name;
    int age;
    
    Person(String name, int age){          //Parameterized Constructor
        this.name = name;
        this.age = age;
    }

}
class Teacher extends Person{        //Derived Class
    String subject;
    int employeeID;
    Teacher(String name, int age, String subject, int employeeID){   //Parameterized Constructor
        super(name,age);            //Calling parent class constructor
        this.subject = subject;
        this.employeeID = employeeID;
    }
    public void displayTeacherDetails(){         //Method to display teacher details
        System.out.println("------Teacher Details------:");
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Employee ID: " + employeeID);

    }
}

class Student extends Person{        //Derived Class
    int studentID;
    String grade;
    Student(String name, int age, int studentID, String grade){   //Parameterized Constructor
        super(name,age);            //Calling parent class constructor
        this.studentID = studentID;
        this.grade = grade;
    }
    public void displayStudentDetails(){         //Method to display student details
        System.out.println("------Student Details------:");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);

    }
}
class Staff extends Person{          //Derived Class
    String department;
    int staffID;
    Staff(String name, int age, String department, int staffID){     //Parameterized Constructor
        super(name,age);            //Calling parent class constructor
        this.department = department;
        this.staffID = staffID;
    }
    public void displayStaffDetails(){         //Method to display staff details
        System.out.println("------Staff Details------:");
        System.out.println("Staff Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
       System.out.println("Staff ID: " + staffID);

    }
}

public class SchoolSystem {               //Main Class
    public static void main(String[] args){
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics", 101);          //Creating object of Teacher class
        Student s = new Student("Rahul", 16, 201, "A");       //Creating object of Student class
        Staff st = new Staff("Mrs. Patel", 35, "Administration", 301);            //Creating object of Staff class
        t.displayTeacherDetails();
        s.displayStudentDetails();
        st.displayStaffDetails();
     
    }
    
}
