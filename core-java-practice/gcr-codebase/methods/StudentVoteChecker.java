import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student can vote or not
    public boolean canStudentVote(int age) {

        // First checking for negative age (invalid case)
        if (age < 0) {
            return false; // cannot vote, age itself is wrong
        }

        // Check if age is 18 or above
        if (age >= 18) {
            return true; // eligible to vote
        }

        // If age is less than 18
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Creating object to call non-static method
        StudentVoteChecker checker = new StudentVoteChecker();

        // Loop to take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Calling method to check voting eligibility
            boolean canVote = checker.canStudentVote(ages[i]);

            // Displaying result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }

            System.out.println(); 
        }

        sc.close();
    }
}

