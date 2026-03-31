package reflection.object_tojson;

import java.lang.reflect.Field;

// Utility class to convert Object to JSON
public class JsonUtil {

    public static String toJson(Object obj)
            throws Exception {

        Class<?> clazz = obj.getClass();

        Field[] fields =
                clazz.getDeclaredFields();

        StringBuilder json =
                new StringBuilder("{");

        // Loop through fields
        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];

            // Allow private access
            field.setAccessible(true);

            // Get name and value
            String name =
                    field.getName();

            Object value =
                    field.get(obj);

            // Add to JSON string
            json.append("\"")
                    .append(name)
                    .append("\":\"")
                    .append(value)
                    .append("\"");

            // Add comma if not last
            if (i != fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");

        return json.toString();
    }
}
