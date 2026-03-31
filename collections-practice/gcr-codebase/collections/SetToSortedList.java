import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // converting to list
        List<Integer> sortedList = new ArrayList<>(nums);

        // just sort the list
        Collections.sort(sortedList);

        System.out.println(sortedList);
    }
}
