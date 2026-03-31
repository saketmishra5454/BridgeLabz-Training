package reflection.method_execution_timing;

class Task {
    public void doWork() {
        // Simple delay
        for (int i = 0; i < 100000000; i++) {
            int x = i * i;
        }
    }
}
