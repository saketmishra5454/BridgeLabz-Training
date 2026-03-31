package annotations.repeatable_annotation;

public class TestApp {

    @BugReport(description = "Null pointer bug")
    @BugReport(description = "UI alignment issue")
    public void testMethod() {
        System.out.println("Testing...");
    }
}
