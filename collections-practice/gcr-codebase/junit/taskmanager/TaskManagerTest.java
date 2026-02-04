package junit.taskmanager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    @Timeout(2) // Max 2 seconds
    void testTimeout() throws Exception {

        TaskManager t = new TaskManager();

        t.longRunningTask();
    }
}
