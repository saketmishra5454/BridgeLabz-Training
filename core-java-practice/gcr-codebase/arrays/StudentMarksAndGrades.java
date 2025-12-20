import java.util.Scanner;

public class StudentMarksAndGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        // arrays to store marks of 3 subjects
        int[][] marks = new int[n][3]; // 0-physics, 1-chemistry, 2-maths

        // array to store percentage
        double[] percentage = new double[n];

        // array to store grade
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

                // if negative marks, ask again
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative, enter again.");
                    j--; // decrement index to re-enter
                }
            }
        }
        // calculating percentage and grade
        for (int i = 0; i < n; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            // deciding grade based on percentage
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
        // displaying final result
        System.out.println("\nStudent Details:");
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    percentage[i], grade[i]);
        }
    }
}
