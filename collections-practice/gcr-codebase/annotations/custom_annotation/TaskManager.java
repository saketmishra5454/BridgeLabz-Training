package annotations.custom_annotation;

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Saket")
    public void developApp() {
        System.out.println("Developing App...");
    }
}
