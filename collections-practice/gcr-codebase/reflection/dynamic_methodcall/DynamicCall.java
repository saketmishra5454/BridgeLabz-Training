package reflection.dynamic_methodcall;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicCall {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        MathOperations m = new MathOperations();

        System.out.print("Enter method name: ");
        String name = sc.nextLine();

        Method method =
                m.getClass().getMethod(name, int.class, int.class);

        Object result = method.invoke(m, 10, 5);

        System.out.println("Result = " + result);
        sc.close();
    }
}
