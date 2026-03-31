import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceTest {

    // Linear Search → O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search → O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Utility to generate random dataset
    public static int[] generateDataset(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    public static void main(String[] args) {

        // Test dataset sizes
        int[] sizes = {1000, 10000, 1000000};

        System.out.println("===== Performance Comparison: Linear vs Binary Search =====\n");

        for (int size : sizes) {
            int[] data = generateDataset(size);
            int target = data[size - 1]; // guaranteed to exist

            System.out.println("Dataset Size: " + size);

            // ---- Linear Search Test ----
            long startLS = System.nanoTime();
            linearSearch(data, target);
            long endLS = System.nanoTime();
            double linearTimeMs = (endLS - startLS) / 1_000_000.0;

            // ---- Binary Search Test (sort first) ----
            long startSort = System.nanoTime();
            Arrays.sort(data); // O(N log N)
            long endSort = System.nanoTime();
            double sortTimeMs = (endSort - startSort) / 1_000_000.0;

            long startBS = System.nanoTime();
            binarySearch(data, target);
            long endBS = System.nanoTime();
            double binaryTimeMs = (endBS - startBS) / 1_000_000.0;

            System.out.printf("Linear Search Time: %.3f ms\n", linearTimeMs);
            System.out.printf("Sorting Time      : %.3f ms\n", sortTimeMs);
            System.out.printf("Binary Search Time: %.3f ms\n\n", binaryTimeMs);
        }
    }
}
