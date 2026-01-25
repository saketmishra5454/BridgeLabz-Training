import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // union means all elements
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // intersection means common elements
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectSet);
    }
}
