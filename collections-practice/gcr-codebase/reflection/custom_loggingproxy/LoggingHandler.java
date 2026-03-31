package reflection.custom_loggingproxy;

import java.lang.reflect.*;

class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy,
                         Method method,
                         Object[] args)
            throws Throwable {

        // Log before execution
        System.out.println("Calling Method: "
                + method.getName());

        // Call actual method
        return method.invoke(target, args);
    }
}

