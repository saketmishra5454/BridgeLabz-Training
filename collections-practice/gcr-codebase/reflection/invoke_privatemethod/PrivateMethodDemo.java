package reflection.invoke_privatemethod;

import java.lang.reflect.Method;

public class PrivateMethodDemo {

    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();

        Class<?> cls = c.getClass();

        Method m =
                cls.getDeclaredMethod("multiply", int.class, int.class);

        m.setAccessible(true);

        int result = (int) m.invoke(c, 4, 5);

        System.out.println("Result = " + result);
    }
}
