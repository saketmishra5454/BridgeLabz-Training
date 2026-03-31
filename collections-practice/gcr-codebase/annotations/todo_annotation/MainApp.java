package annotations.todo_annotation;

import java.lang.reflect.Method;

class Project {

    @Todo(task="Add Login", assignedTo="Amit")
    public void login() {}

    @Todo(task="Add Payment",
            assignedTo="Saket",
            priority="HIGH")
    public void payment() {}
}

public class MainApp {

    public static void main(String[] args) {

        for (Method m : Project.class.getDeclaredMethods()) {

            if (m.isAnnotationPresent(Todo.class)) {

                Todo t = m.getAnnotation(Todo.class);

                System.out.println("Task: " + t.task());
                System.out.println("Assigned: " + t.assignedTo());
                System.out.println("Priority: " + t.priority());
            }
        }
    }
}

