public class PeakElement {

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            // if slope is rising, go right
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid; // otherwise go left
            }
        }

        return left; // index of peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element: " + arr[peakIndex] + " at index " + peakIndex);
    }
}
