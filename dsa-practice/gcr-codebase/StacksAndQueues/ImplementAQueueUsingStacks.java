import java.util.Stack;

public class ImplementAQueueUsingStacks
 {
    // We need two stacks as per the hint
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public ImplementAQueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void enqueue(int x) {
        inputStack.push(x);
        System.out.println("Enqueued: " + x);
    }

    // Removes the element from in front of queue and returns it
    public int dequeue() {
        // If the outputStack is empty, move everything from inputStack to it
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        // If both are empty, the queue is empty
        if (outputStack.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; 
        }

        return outputStack.pop();
    }

    // Get the front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Returns whether the queue is empty
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    public static void main(String[] args) {
        ImplementAQueueUsingStacks queue = new ImplementAQueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // Should be 10
        System.out.println("Front element: " + queue.peek()); // Should be 20
        
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // Should be 20
    }
}