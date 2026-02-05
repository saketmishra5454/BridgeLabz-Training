package reflection.retrieve_annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {

    String name();
}
