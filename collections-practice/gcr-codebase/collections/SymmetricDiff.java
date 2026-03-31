import java.util.*;

public class SymmetricDiff {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // union part
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // intersect part
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        // now remove common things from union
        unionSet.removeAll(intersectSet);

        System.out.println(unionSet); // prints symmetric diff
    }
}
