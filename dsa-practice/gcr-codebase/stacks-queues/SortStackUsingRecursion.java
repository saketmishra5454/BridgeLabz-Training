import java.util.Stack;

public class SortStackUsingRecursion {

    // Main recursive function to "empty" the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: if stack is empty, we stop popping
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Push the popped element back in its correct sorted position
        sortedInsert(stack, top);
    }

    // Helper recursive function to insert element in sorted order
    private static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: if stack is empty OR element is greater than top, just push it
         
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // If the element is smaller than the current top, 
        // remove the top and find the right spot for our element
        int top = stack.pop();
        sortedInsert(stack, element);

        // Put the top back after the element is inserted
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack before sorting: " + s);

        sortStack(s);

        System.out.println("Stack after sorting:  " + s);
    }
}
