import java.util.*;

public class SearchStructureComparison {

    public static void main(String[] args) {

        int[] testSizes = {1000, 100000, 1000000};
        Random rand = new Random();

        System.out.println("===== Data Structure Search Performance =====\n");

        for (int size : testSizes) {
            System.out.println("Dataset Size: " + size);

            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Fill data structures
            for (int i = 0; i < size; i++) {
                int val = rand.nextInt(size * 2);
                array[i] = val;
                hashSet.add(val);
                treeSet.add(val);
            }

            int target = array[size - 1]; // guaranteed to exist

            // ----- Array Search O(N) -----
            long startA = System.currentTimeMillis();
            boolean foundArray = false;
            for (int num : array) {
                if (num == target) {
                    foundArray = true;
                    break;
                }
            }
            long endA = System.currentTimeMillis();

            // ----- HashSet Search O(1) -----
            long startH = System.currentTimeMillis();
            boolean foundHash = hashSet.contains(target);
            long endH = System.currentTimeMillis();

            // ----- TreeSet Search O(log N) -----
            long startT = System.currentTimeMillis();
            boolean foundTree = treeSet.contains(target);
            long endT = System.currentTimeMillis();

            System.out.println("Array Search  Time: " + (endA - startA) + " ms");
            System.out.println("HashSet Search Time: " + (endH - startH) + " ms");
            System.out.println("TreeSet Search Time: " + (endT - startT) + " ms");
        }
    }
}
