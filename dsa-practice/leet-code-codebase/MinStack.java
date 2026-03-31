import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minStack.peek())
            minStack.pop();
    }

    public int top() {           //it give the top element
        return stack.peek();
    }

    public int getMin() {      //find min
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 5
    }
}
