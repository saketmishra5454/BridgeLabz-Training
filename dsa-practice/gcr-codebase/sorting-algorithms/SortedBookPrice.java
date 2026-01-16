

import java.util.Scanner;

public class SortedBookPrice {

    public static void main(String[] args) {

        // Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        // Creating array to store book prices
        int[] arr = new int[n];

        // Taking input of book prices
        for (int i = 0; i < n; i++) {
            System.out.println("Enter price of book no: " + (i + 1));
            arr[i] = sc.nextInt();
        }


        int[] price = sortedPrice(arr, 0, arr.length - 1);

        // Printing sorted prices
        System.out.println("Sorted prices:");
        for (int p : price) {
            System.out.print(p + " ");
        }
    }

    // Method to divide array and sort using merge sort
    static int[] sortedPrice(int[] arr, int lo, int hi) {

        // Base condition: when only one element is left
        if (lo == hi) {
            // Returning single element array
            return new int[]{arr[lo]};
        }

        // Finding middle index
        int mid = (lo + hi) / 2;

        // Recursively sorting left half
        int[] left = sortedPrice(arr, lo, mid);

        // Recursively sorting right half
        int[] right = sortedPrice(arr, mid + 1, hi);

        // Merging two sorted halves
        return mergeTwoSorted(left, right);
    }

    // Method to merge two sorted arrays
    static int[] mergeTwoSorted(int[] arr1, int[] arr2) {

        // Result array of combined size
        int[] mergeArr = new int[arr1.length + arr2.length];

        // i -> index for arr1
        // j -> index for arr2
        // k -> index for mergeArr
        int i = 0, j = 0, k = 0;

        // Comparing elements from both arrays and inserting smaller one
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArr[k++] = arr1[i++];
            } else {
                mergeArr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 (if any)
        while (i < arr1.length) {
            mergeArr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 (if any)
        while (j < arr2.length) {
            mergeArr[k++] = arr2[j++];
        }

        // Returning merged sorted array
        return mergeArr;
    }
}

