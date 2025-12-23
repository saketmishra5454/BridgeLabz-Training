import java.util.Random;

public class StudentGradeSystem {

    // method to generate random 2-digit marks for PCM
    // returns 2D array -> rows = students, cols = P C M
    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];
        Random rand = new Random();

        // generating random marks between 10 and 99
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(90) + 10;
            }
        }
        return marks;
    }

    // method to calculate total, average and percentage
    // returns 2D array -> total, average, percentage
    public static double[][] calculateResults(int[][] marks) {

        int students = marks.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // rounding to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // method to calculate grade based on percentage
    // returns 1D array of grades
    public static String[] calculateGrade(double[][] results) {

        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {

            double percent = results[i][2];

            if (percent >= 80) {
                grades[i] = "A";
            } else if (percent >= 70) {
                grades[i] = "B";
            } else if (percent >= 60) {
                grades[i] = "C";
            } else if (percent >= 50) {
                grades[i] = "D";
            } else if (percent >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // method to display scorecard in tabular format
    public static void displayScoreCard(
            int[][] marks, double[][] results, String[] grades) {

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i]
            );
        }
    }

    // main method
    public static void main(String[] args) {

        int students = 5; // can change number of students

        // step 1: generate marks
        int[][] marks = generateMarks(students);

        // step 2: calculate total, average and percentage
        double[][] results = calculateResults(marks);

        // step 3: calculate grades
        String[] grades = calculateGrade(results);

        // step 4: display result
        displayScoreCard(marks, results, grades);
    }
}
