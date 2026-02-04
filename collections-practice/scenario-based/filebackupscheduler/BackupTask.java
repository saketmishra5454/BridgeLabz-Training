package filebackupscheduler;
// BackupTask class
// implements Comparable for priority queue sorting
public class BackupTask implements Comparable<BackupTask> {

    String folderPath;
    int priority;   // higher number means higher priority
    String time;

    public BackupTask(String folderPath, int priority, String time) {
        this.folderPath = folderPath;
        this.priority = priority;
        this.time = time;
    }

    // compare method for PriorityQueue
    @Override
    public int compareTo(BackupTask other) {
        // higher priority task should come first
        return Integer.compare(other.priority, this.priority);
    }
}
