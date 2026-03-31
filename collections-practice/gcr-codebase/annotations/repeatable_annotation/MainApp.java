package annotations.repeatable_annotation;

import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args)
            throws Exception {

        Method m =
                TestApp.class.getMethod("testMethod");

        BugReport[] reports =
                m.getAnnotationsByType(BugReport.class);

        for (BugReport b : reports) {
            System.out.println(b.description());
        }
    }
}
