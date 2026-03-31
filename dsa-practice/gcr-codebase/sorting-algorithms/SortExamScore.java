

import java.util.Scanner;

public class SortExamScore {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array to store exam scores
        int[] scores = new int[n];

        // Taking exam scores from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter exam score of student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        // Calling Selection Sort method
        selectionSort(scores);

        // Displaying sorted exam scores
        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    // Selection Sort method
    static void selectionSort(int[] arr) {

        // Loop to move boundary of unsorted array
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current index has the minimum value
            int minIndex = i;

            // Find the minimum element in remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

