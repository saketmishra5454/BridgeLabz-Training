package reflection.dependency_injection;

import java.lang.reflect.*;

class DIContainer {
    public static void inject(Object obj)
            throws Exception {
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {

                field.setAccessible(true);
                // Create dependency object
                Object dep =
                        field.getType()
                                .getDeclaredConstructor()
                                .newInstance();
                field.set(obj, dep);
            }
        }
    }
}
