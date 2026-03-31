package annotations.log_executiontime;

import java.lang.reflect.Method;

class Service {
    @LogExecutionTime
    public void process() {
        for(int i=0;i<1000000;i++){}
    }
}
public class MainApp {

    public static void main(String[] args)
            throws Exception {
        Service s = new Service();
        Method m =
                s.getClass().getMethod("process");

        if (m.isAnnotationPresent(LogExecutionTime.class)) {

            long start = System.nanoTime();

            m.invoke(s);
            long end = System.nanoTime();

            System.out.println(
                    "Time: " + (end-start));
        }
    }
}
