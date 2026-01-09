import java.time.LocalDate;

// Task Node (Linked List Node)
class TaskNode {
    int taskId;
    String taskName;
    String priority;
    LocalDate dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, String priority, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

// Circular Linked List Scheduler
class TaskScheduler {

    private TaskNode head = null;
    private TaskNode current = null;

    // Add at beginning
    public void addAtBeginning(int id, String name, String priority, LocalDate dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
        if (current == null) current = head;
    }

    // Add at end
    public void addAtEnd(int id, String name, String priority, LocalDate dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        if (current == null) current = head;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int id, String name, String priority, LocalDate dueDate, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        TaskNode temp = head, prev = null;

        // Case: Deleting head node
        if (head.taskId == id) {
            if (head.next == head) {
                head = null;
                current = null;
            } else {
                while (temp.next != head) temp = temp.next;
                head = head.next;
                temp.next = head;
                if (current != null && current.taskId == id) current = head;
            }
            System.out.println("Task removed: " + id);
            return;
        }

        // Searching for other nodes
        temp = head;
        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == id) {
                prev.next = temp.next;
                if (current != null && current.taskId == id) current = prev;
                System.out.println("Task removed: " + id);
                return;
            }
        } while (temp != head);

        System.out.println("Task ID not found.");
    }

    // View current task and move to next circularly
    public void viewCurrentAndNext() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        displayTask(current);
        current = current.next; // move circularly
    }

    // Search by priority
    public void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Helper method
    private void displayTask(TaskNode node) {
        System.out.println("Task ID   : " + node.taskId);
        System.out.println("Task Name : " + node.taskName);
        System.out.println("Priority  : " + node.priority);
        System.out.println("Due Date  : " + node.dueDate);
        System.out.println("----------------------");
    }
}

// Main class to test
public class TaskSchedulerSystem {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Write Report", "High", LocalDate.of(2024, 12, 10));
        scheduler.addAtBeginning(2, "Team Meeting", "Medium", LocalDate.of(2024, 12, 8));
        scheduler.addAtPosition(3, "Code Review", "Low", LocalDate.of(2024, 12, 15), 2);

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nSearch By Priority (High):");
        scheduler.searchByPriority("High");

        System.out.println("\nView Circular Tasks:");
        scheduler.viewCurrentAndNext();
        scheduler.viewCurrentAndNext();
        scheduler.viewCurrentAndNext();

        System.out.println("\nRemove Task ID 2:");
        scheduler.removeById(2);

        System.out.println("\nAll Tasks After Removal:");
        scheduler.displayAllTasks();
    }
}
