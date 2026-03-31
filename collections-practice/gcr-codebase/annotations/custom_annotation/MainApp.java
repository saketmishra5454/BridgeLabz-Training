package annotations.custom_annotation;
import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args) {

        Class<TaskManager> c = TaskManager.class;

        for (Method m : c.getDeclaredMethods()) {

            if (m.isAnnotationPresent(TaskInfo.class)) {

                TaskInfo info =
                        m.getAnnotation(TaskInfo.class);

                System.out.println("Method: " + m.getName());
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
            }
        }
    }
}

