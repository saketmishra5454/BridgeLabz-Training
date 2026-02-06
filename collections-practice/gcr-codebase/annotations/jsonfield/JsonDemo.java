package annotations.jsonfield;

import java.lang.reflect.Field;

public class JsonDemo {
    public static String toJson(Object obj)
            throws Exception {
        String json = "{";

        for (Field f :
                obj.getClass().getDeclaredFields()) {

            f.setAccessible(true);
            JsonField j =
                    f.getAnnotation(JsonField.class);

            json += "\"" + j.name() + "\":\"" +
                    f.get(obj) + "\",";
        }
        json = json.substring(0,
                json.length() - 1);

        return json + "}";
    }

    public static void main(String[] args)
            throws Exception {
        UserJson u = new UserJson();

        System.out.println(toJson(u));
    }
}
