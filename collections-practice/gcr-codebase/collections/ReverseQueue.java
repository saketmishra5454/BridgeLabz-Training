import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        // using stack to reverse because queue alone cant reverse itself easily
        Stack<Integer> st = new Stack<>();

        // remove all from queue and push into stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        // pop from stack and add back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        System.out.println(q); 
    }
}
