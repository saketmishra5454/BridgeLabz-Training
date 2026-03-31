package inheritance;
class Course{            //Base Class
    String CourseName;
    int duration;

    public Course(String CourseName, int duration){          //Parameterized Constructor
        this.CourseName = CourseName;
        this.duration = duration;
    }

}
class OnlineCourse extends Course{           //Derived Class
    String platform;
    boolean isRecorded;
    OnlineCourse(String CourseName, int duration,String platform, boolean isRecorded){    //Parameterized Constructor
        super(CourseName,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public void displayCourseDetails(){            //Method to display course details
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);       

    }


}
class PaidOnlineCourse extends OnlineCourse{    //Derived Class
    int fee;
    int discount;
    public PaidOnlineCourse(String CourseName,int duration,String platform, boolean isRecorded, int fee, int discount){   //Parameterized Constructor
        super(CourseName,duration,platform,isRecorded);            //Calling parent class constructor
        this.fee = fee;
        this.discount = discount;
    }
    public int calTotalFee(){                  //Method to calculate total fee after discount
        int discountedFee = discount*(fee/100);
        return fee - discountedFee;

    }
    public void displayFullCourseDetails(){           //Method to display full course details
        displayCourseDetails();
        
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Fee after Discount: ₹" + calTotalFee());

    }


}

public class EducationalCourse {              //Main Class
    public static void main(String[] args){
        PaidOnlineCourse pd = new PaidOnlineCourse("Programming In Java",40,"GFG", true, 5000, 10);   //Creating object of PaidOnlineCourse class
        pd.displayFullCourseDetails();


    }
}
