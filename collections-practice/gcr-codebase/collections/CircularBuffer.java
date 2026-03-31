public class CircularBuffer {
    private int[] arr;
    private int head = 0;
    private int size = 0;
    private int capacity;

    public CircularBuffer(int cap) {
        this.capacity = cap;
        arr = new int[cap];
    }

    public void add(int x) {
        // insert at (head + size) % capacity
        int index = (head + size) % capacity;
        arr[index] = x;

        if (size < capacity) {
            size++; // still space
        } else {
            head = (head + 1) % capacity; // overwrite oldest
        }
    }

    public void printBuffer() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % capacity;
            System.out.print(arr[index]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.printBuffer(); // [1, 2, 3]

        cb.add(4); // overwrites 1
        cb.printBuffer();
    }
}
