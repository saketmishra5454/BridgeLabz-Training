package junit.taskmanager;
public class TaskManager {

    // Long task
    public String longRunningTask() throws Exception {

        Thread.sleep(3000); // 3 seconds

        return "Done";
    }
}
