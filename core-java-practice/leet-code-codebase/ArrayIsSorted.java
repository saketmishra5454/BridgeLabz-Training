import java.util.Scanner;

public class ArrayIsSorted {

    public static boolean isSortedIteratively(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedRecursively(int[] array, int idx) {
        if (idx >= array.length - 1) {
            return true;
        }
        if (array[idx + 1] < array[idx]) {
            return false;
        }
        return isSortedRecursively(array, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[8];
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(
            "Array is sorted using iterative method: " + isSortedIteratively(array)
        );
        System.out.println(
            "Array is sorted using recursive method: " + isSortedRecursively(array, 0)
        );

        sc.close();
    }
}
