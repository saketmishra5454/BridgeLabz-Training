public class StudentScoreManagement {
    public static void main(String[] args) {

        // Creating the array of Student class
        Student[] students = new Student[10];
        students[0] = new Student("Virat Kohli", 98);
        students[1] = new Student("MS Dhoni", 88);
        students[2] = new Student("Rohit Sharma", 90);
        students[3] = new Student("Sachin Tendulkar", 95);
        students[4] = new Student("Neeraj Chopra", 89);
        students[5] = new Student("PV Sindhu", 91);
        students[6] = new Student("Sunil Chhetri", 87);
        students[7] = new Student("Mary Kom", 93);
        students[8] = new Student("Hardik Pandya", 85);
        students[9] = new Student("Kapil Dev", 94);

        // Creating the object of StudentDetails class
        StudentDetails tenthClass = new StudentDetails(students);

        // To Display the average marks
        tenthClass.calculateAverage();

        // To Display the Highest and lowest marks
        tenthClass.calculateMaxAndMin();

        // To Display the Student name and marks above average
        tenthClass.aboveAverage();
    }
}

class StudentDetails{
    Student[] array;                                       // Array stores multiple Student Information

    // Constructor of StudentDetails class
    public StudentDetails(Student[] array){
        this.array = array;
    }

    // This method calculate and display the average score of the students
    public void calculateAverage(){
        int sum = 0;
        for(int i = 0; i < this.array.length; i++){
            sum += this.array[i].marks;
        }
        double average = (double) sum/this.array.length;
        System.out.println("Average Marks of This Class Student is : ");
        System.out.printf("%.2f\n",average);
        System.out.println("_______________________________________________________________________________________________________________________________");
    }

    // This method calculate and display the average score of the students
    public double average(){
        int sum = 0;
        for(int i = 0; i < this.array.length; i++){
            sum += this.array[i].marks;
        }
        double average = (double) sum/this.array.length;
        return average;
    }

    // This method calculate and display the highest and lowest score of the student
    public void calculateMaxAndMin(){
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].marks > this.array[maxIndex].marks){
                maxIndex = i;
            }
            if(this.array[i].marks < this.array[minIndex].marks){
                minIndex = i;
            }
        }

        System.out.printf("The Student with name "+this.array[maxIndex].name+" have "+this.array[maxIndex].marks+" marks Which is Highest marks in class \n");
        System.out.printf("The Student with name "+this.array[minIndex].name+" have "+this.array[minIndex].marks+" marks Which is Lowest marks in class \n");
        System.out.println("_______________________________________________________________________________________________________________________________");

    }

    // This method prints the name of the student who Scores above the average
    public void aboveAverage(){
        System.out.println("The Student name and marks who has scored marks more than average : ");
        double average = this.average();
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].marks > average){
                System.out.println(this.array[i].name+" -> "+this.array[i].marks);
            }
        }
        System.out.println("_______________________________________________________________________________________________________________________________");
    }

}

// Student class
class Student{
    String name;                                                                        // Stores the name of student
    int marks;                                                                          // Stores the marks of the student

    // Constructor of Student class
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}