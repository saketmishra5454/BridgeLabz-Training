import java.util.*;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x); // just add item
    }

    public int pop() {
        if (q1.isEmpty()) return -1;

        // move until last element remains in q1
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();
        q2.add(top);

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop()); 
    }
}
