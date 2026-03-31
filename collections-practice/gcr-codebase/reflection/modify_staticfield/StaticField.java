package reflection.modify_staticfield;

import java.lang.reflect.Field;

public class StaticField {

    public static void main(String[] args) throws Exception {

        Class<?> c = Configuration.class;

        Field f = c.getDeclaredField("API_KEY");

        f.setAccessible(true);

        f.set(null, "NEWKEY123");

        System.out.println("Updated API Key = " + f.get(null));
    }
}

