package annotations.mark_important;

import java.lang.reflect.Method;

class Demo {

    @ImportantMethod
    public void login() {}

    @ImportantMethod(level = "LOW")
    public void logout() {}
}

public class MainApp {

    public static void main(String[] args) {

        for (Method m : Demo.class.getDeclaredMethods()) {

            if (m.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im =
                        m.getAnnotation(ImportantMethod.class);

                System.out.println(
                        m.getName() + " - " + im.level());
            }
        }
    }
}

