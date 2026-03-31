import java.util.*;

public class ReverseArrayList{

    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original ArrayList: " + list);

        reverseArrayList(list);

        System.out.println("Reversed ArrayList: " + list);
    }
}
