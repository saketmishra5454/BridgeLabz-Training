import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceTest {

    // -------------------------
    // Bubble Sort - O(N^2)
    // -------------------------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // optimization
        }
    }

    // -------------------------
    // Merge Sort - O(N log N)
    // -------------------------
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    // -------------------------
    // Quick Sort - O(N log N)
    // -------------------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
            }
        }

        int tmp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = tmp;
        return i + 1;
    }

    // -------------------------
    // Generate Random Array
    // -------------------------
    public static int[] generateDataset(int n) {
        Random rand = new Random();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = rand.nextInt(n);
        return data;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        System.out.println("===== Sorting Performance Comparison =====\n");

        for (int n : sizes) {
            System.out.println("Dataset Size: " + n);

            int[] data1 = generateDataset(n);
            int[] data2 = Arrays.copyOf(data1, n);
            int[] data3 = Arrays.copyOf(data1, n);

            // Bubble Sort (skip for huge n to avoid hours of execution)
            if (n <= 10000) {
                long startB = System.currentTimeMillis();
                bubbleSort(data1);
                long endB = System.currentTimeMillis();
                System.out.println("Bubble Sort Time: " + (endB - startB) + " ms");
            } else {
                System.out.println("Bubble Sort Time: SKIPPED (too slow)");
            }

            // Merge Sort
            long startM = System.currentTimeMillis();
            mergeSort(data2, 0, data2.length - 1);
            long endM = System.currentTimeMillis();
            System.out.println("Merge Sort Time : " + (endM - startM) + " ms");

            // Quick Sort
            long startQ = System.currentTimeMillis();
            quickSort(data3, 0, data3.length - 1);
            long endQ = System.currentTimeMillis();
            System.out.println("Quick Sort Time : " + (endQ - startQ) + " ms");

            System.out.println();
        }
    }
}
