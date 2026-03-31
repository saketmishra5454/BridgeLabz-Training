package filebackupscheduler;
import java.util.PriorityQueue;

// main scheduler class
public class BackupScheduler {

    // priority queue to store backup tasks
    PriorityQueue<BackupTask> backupQueue = new PriorityQueue<>();

    // method to add backup task
    public void addBackupTask(String folderPath, int priority, String time)
            throws InvalidBackupPathException {

        // simple validation for path
        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Backup path is invalid.");
        }

        BackupTask task = new BackupTask(folderPath, priority, time);
        backupQueue.add(task);

        System.out.println("Backup task added for: " + folderPath);
    }

    // method to execute backup tasks in priority order
    public void executeBackups() {

        System.out.println("\nExecuting backup tasks based on priority:");

        // tasks will come out in sorted order automatically
        while (!backupQueue.isEmpty()) {
            BackupTask task = backupQueue.poll();

            System.out.println("Backing up folder: " + task.folderPath +
                    " | Time: " + task.time +
                    " | Priority: " + task.priority);
        }
    }
}
