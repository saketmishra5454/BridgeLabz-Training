public class FirstNegativeSearch {

    public static int findFirstNegative(int[] arr) {

        // Step through the array from start
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {  // check if negative
                return i;      // return index of first negative
            }
        }

        return -1; // no negative number found
    }

    public static void main(String[] args) {

        int[] numbers = {4, 7, 12, -3, 8, -9};

        int index = findFirstNegative(numbers);

        if (index != -1)
            System.out.println("First negative number found at index: " + index);
        else
            System.out.println("No negative number found.");
    }
}
