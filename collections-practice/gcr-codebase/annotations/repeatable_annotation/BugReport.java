package annotations.repeatable_annotation;

import java.lang.annotation.*;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {

    String description();
}
