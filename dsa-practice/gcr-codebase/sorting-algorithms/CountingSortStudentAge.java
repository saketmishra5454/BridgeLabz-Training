

import java.util.Scanner;

public class CountingSortStudentAge {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array to store student ages
        int[] ages = new int[n];

        // Taking age input with validation (10 to 18)
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + " (10 to 18): ");
            int age = sc.nextInt();

            // Validate age range
            if (age < 10 || age > 18) {
                System.out.println(" Invalid age! Please enter between 10 and 18.");
                i--; // repeat this input
                continue;
            }

            ages[i] = age;
        }

        // Calling Counting Sort
        countingSort(ages);

        // Displaying sorted ages
        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    // Counting Sort method (range is fixed: 10 to 18)
    static void countingSort(int[] arr) {

        int minAge = 10;
        int maxAge = 18;

        // Create count array for age range
        int[] count = new int[maxAge - minAge + 1];

        // Step 1: Count frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Calculate cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Output array to store sorted ages
        int[] output = new int[arr.length];

        // Step 3: Place elements in correct position (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Copy sorted data back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
