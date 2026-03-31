package reflection.method_execution_timing;

import java.lang.reflect.Method;

class MethodTimer {
    public static void main(String[] args)
            throws Exception {
        Task obj = new Task();

        Class<?> clazz = obj.getClass();
        Method method =
                clazz.getDeclaredMethod("doWork");
        long start =
                System.currentTimeMillis();
        // Call method dynamically
        method.invoke(obj);

        long end =
                System.currentTimeMillis();
        System.out.println(
                "Execution Time: "
                        + (end - start) + " ms");
    }
}
