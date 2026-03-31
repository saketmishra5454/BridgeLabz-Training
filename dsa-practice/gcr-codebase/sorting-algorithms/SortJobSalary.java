
import java.util.Scanner;

public class SortJobSalary {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number of job applicants
        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        // Array to store expected salary demands
        int[] salary = new int[n];

        // Taking salary demands from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter expected salary of applicant " + (i + 1) + ": ");
            salary[i] = sc.nextInt();
        }

        // Calling Heap Sort method
        heapSort(salary);

        // Displaying sorted salary demands
        System.out.println("Sorted Salary Demands (Ascending Order):");
        for (int s : salary) {
            System.out.print(s + " ");
        }
    }

    // Heap Sort method
    static void heapSort(int[] arr) {

        int n = arr.length;

        // STEP 1: Build Max Heap
        // Starting from last non-leaf node and heapifying each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // STEP 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify method to maintain Max Heap property
    static void heapify(int[] arr, int n, int i) {

        // Assume root is largest
        int largest = i;

        // Left and right child indices
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {

            // Swap root with largest
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}

