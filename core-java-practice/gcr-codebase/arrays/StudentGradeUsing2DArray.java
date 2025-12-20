import java.util.Scanner;

public class StudentGradeUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        // 2D array to store marks
        // rows -> students, columns -> subjects
        // 0-Physics, 1-Chemistry, 2-Maths
        int[][] marks = new int[n][3];

        // arrays to store percentage and grade
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // taking marks input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    System.out.print("Physics: ");
                } else if (j == 1) {
                    System.out.print("Chemistry: ");
                } else {
                    System.out.print("Maths: ");
                }

                marks[i][j] = sc.nextInt();

                // if negative value, ask again
                if (marks[i][j] < 0) {
                    System.out.println("Marks should be positive, enter again.");
                    j--; // go back to same subject
                }
            }
        }

        // calculating percentage and grade using 2D array
        for (int i = 0; i < n; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            // deciding grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // displaying result
        System.out.println("\nStudent Report:");
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c\n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close(); // scanner closed
    }
}
