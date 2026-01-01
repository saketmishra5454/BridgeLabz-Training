// Online Course Management System
public class Course {         // Course class with constructors and static variable
    String courseName;
    int duration;
    int fee;

    static String instituteName = "BridgeLabz";      // static variable shared by all instances

    public Course(String c,int d, int f){      // parameterized constructor
        this.courseName = c;
        this.duration = d;
        this.fee = f;
    }
 // method to display course details
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
        

    }
    public void updateInstituteName(){              // method to update static variable
         Course.instituteName = "Global Code Runners";
    }
    public static void main(String[] args) {
      //  Course.instituteName = "Tech Academy";

        Course course1 = new Course("Java Programming", 6, 5000);     // creating object using parameterized constructor
        course1.displayCourseDetails();
        System.out.println("----------------------------------------------------------"); // just for gap

        Course course2 = new Course("Web Development", 4, 4000);    // creating another object
        course2.displayCourseDetails();
        System.out.println("----------------------------------------------------------"); // just for gap

        course2.updateInstituteName();              // updating static variable using method

        Course course3 = new Course("Data Science", 8, 8000);  // creating third object
        course3.displayCourseDetails();
          System.out.println("----------------------------------------------------------"); // just for gap

    }
 
}
