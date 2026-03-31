import java.util.Scanner;
public class ComputePercentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking marks input
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // checking valid marks
        if (physics < 0 || chemistry < 0 || maths < 0 ||
            physics > 100 || chemistry > 100 || maths > 100) {

            System.out.println("Please enter valid marks b/w 0 and 100.");

        } else {
            // calculating total and average
            int total = physics + chemistry + maths;
            double average = total / 3.0;

            String grade;
            String remarks;

            if (average >= 90) {
                grade = "A";
                remarks = "Excellent";
            } else if (average >= 75) {
                grade = "B";
                remarks = "Very Good";
            } else if (average >= 60) {
                grade = "C";
                remarks = "Good";
            } else if (average >= 40) {
                grade = "D";
                remarks = "Pass";
            } else {
                grade = "F";
                remarks = "Fail";
            }

            // final output
            System.out.println("\nAverage Marks: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
