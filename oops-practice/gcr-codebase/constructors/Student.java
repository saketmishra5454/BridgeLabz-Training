//University Managemtent System

public class Student {             // parent class
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String name,double CGPA){      // constructor
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = CGPA;
    }


public double getCGPA(){      // getter method
    return CGPA;

}
public void setCGPA(double updateCGPA){         // setter method
    this.CGPA = updateCGPA;
  
}

public void displayStudent(){             // method to display student details
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + CGPA);

}
public static void main(String[] args){         // main method
    Student s1 = new Student(45, "Shivam", 79.9);
    System.out.println("----------Student 1 Detail----------");
    s1.displayStudent();

    s1.setCGPA(85.5);
    System.out.println("----------Updated Student 1 Detail----------");
    s1.displayStudent();

    System.out.println("\nUpdated CGPA: " + s1.getCGPA());

    // creating postgraduate student
    PostgraduateStudent pg = new PostgraduateStudent(201, "Riya", 9.1, "Computer Science");

    System.out.println("\n");
    pg.displayPostgraduateDetails();
   }
}
class PostgraduateStudent extends Student {      // child class

    String specialization;

    // constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // method to show use of protected member
    public void displayPostgraduateDetails() {

        // accessing protected variable from parent class
        System.out.println("Postgraduate Student Details");
        System.out.println("Roll Number   : " + rollNumber); // public
        System.out.println("Name          : " + name);       // protected
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA          : " + getCGPA());  // private via public method
    }

}





