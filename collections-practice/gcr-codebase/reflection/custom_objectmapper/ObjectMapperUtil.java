package reflection.custom_objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

// Utility class for mapping Map → Object
public class ObjectMapperUtil {

    // Generic method
    public static <T> T toObject(Class<T> clazz,
                                 Map<String, Object> properties)
            throws Exception {

        // Create object dynamically
        T obj =
                clazz.getDeclaredConstructor().newInstance();

        // Loop through map keys
        for (String key : properties.keySet()) {

            // Get field name
            Field field =
                    clazz.getDeclaredField(key);

            // Allow private access
            field.setAccessible(true);

            // Set value
            field.set(obj, properties.get(key));
        }

        return obj;
    }
}

