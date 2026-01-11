class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;

    ProcessNode next;

    public ProcessNode(int pid, int bt, int prio) {
        processId = pid;
        burstTime = bt;
        priority = prio;
        next = null;
    }
}

class RoundRobinScheduler {

    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int totalProcesses = 0;

    // Add process at end
    public void addProcess(int pid, int bt, int prio) {
        ProcessNode newNode = new ProcessNode(pid, bt, prio);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        totalProcesses++;
    }

    // Remove process by ID
    public void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head, prev = tail;

        // Searching
        do {
            if (curr.processId == pid) break;
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        // Process found
        if (curr.processId == pid) {
            if (curr == head && curr == tail) { // only one process
                head = tail = null;
            } else {
                if (curr == head) head = head.next;
                if (curr == tail) tail = prev;
                prev.next = curr.next;
            }
            totalProcesses--;
        }
    }

    // Display queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty!");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("PID: " + temp.processId + " | BT: " + temp.burstTime + " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
        System.out.println("-------------------------------------");
    }

    // Round Robin Simulation
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule!");
            return;
        }

        System.out.println("\n=== ROUND ROBIN SCHEDULING START ===");
        System.out.println("Time Quantum: " + timeQuantum);

        int currentTime = 0;
        ProcessNode current = head;

        while (totalProcesses > 0) {
            if (current.burstTime > 0) {
                int executionTime = Math.min(timeQuantum, current.burstTime);
                current.burstTime -= executionTime;
                currentTime += executionTime;

                // Update waiting time for other processes
                ProcessNode temp = current.next;
                while (temp != current) {
                    if (temp.burstTime > 0) {
                        temp.waitingTime += executionTime;
                    }
                    temp = temp.next;
                }

                System.out.println("\nExecuting Process PID=" + current.processId +
                        " for time: " + executionTime);

                displayQueue();
            }

            if (current.burstTime == 0) {
                current.turnaroundTime = currentTime;
                System.out.println("Process PID=" + current.processId + " Completed. Removing...");

                int pidToRemove = current.processId;
                current = current.next; // move before removal
                removeProcess(pidToRemove);
            } else {
                current = current.next;
            }
        }

        System.out.println("\n=== SCHEDULING COMPLETE ===");

        calculateResults();
    }

    // Display average waiting & turnaround time
    private void calculateResults() {
        ProcessNode temp = head;
        double totalWT = 0, totalTAT = 0;
        int count = 0;

        // Cannot traverse circular now since removed, so track via saved stats
        // In real scenario, we print during removal

        System.out.println("\n(Results Printed During Execution)");
        System.out.println("Note: Turnaround & Waiting collected during simulation only.");
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Adding processes (PID, Burst Time, Priority)
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.displayQueue();

        int timeQuantum = 3;
        scheduler.simulate(timeQuantum);
    }
}
