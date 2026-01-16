

import java.util.Scanner;

public class SortProductPrice {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        // Array to store product prices
        int[] prices = new int[n];

        // Taking product prices from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        // Calling Quick Sort on entire array
        // 0 -> starting index
        // n-1 -> last index
        quickSort(prices, 0, prices.length - 1);

        // Printing sorted product prices
        System.out.println("Sorted Product Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    // Quick Sort method (Divide and Conquer)
    static void quickSort(int[] arr, int low, int high) {

        // Base condition: at least two elements should be present
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively apply Quick Sort on left sub-array
            quickSort(arr, low, pivotIndex - 1);

            // Recursively apply Quick Sort on right sub-array
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method to place pivot at correct position
    static int partition(int[] arr, int low, int high) {

        // Choosing last element as pivot
        int pivot = arr[high];

        // Index for smaller element
        int i = low - 1;

        // Traversing array and rearranging elements
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
}

