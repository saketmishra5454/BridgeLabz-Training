import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2; // means 2nd from last

        // using two nodes both starting at head
        Iterator<String> slow = list.iterator();
        Iterator<String> fast = list.iterator();

        // moving fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                System.out.println("N is bigger than size");
                return;
            }
        }

        String slowVal = null;

        // now move both till fast hits end
        while (fast.hasNext()) {
            slowVal = slow.next();
            fast.next();
        }

        // after loop slowVal is at correct pos
        System.out.println(slowVal);
    }
}
