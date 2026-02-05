package reflection.access_privatefield;

import java.lang.reflect.Field;


public class PrivateFieldDemo {

    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class<?> c = p.getClass();
        Field f = c.getDeclaredField("age");

        // Allow access
        f.setAccessible(true);
        // Change value
        f.set(p, 25);

        // Read value
        int value = (int) f.get(p);
        System.out.println("Age = " + value);
    }
}

