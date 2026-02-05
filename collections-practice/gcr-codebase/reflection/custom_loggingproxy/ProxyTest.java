package reflection.custom_loggingproxy;

import java.lang.reflect.Proxy;

class ProxyTest {
    public static void main(String[] args) {

        Greeting realObj =
                new GreetingImpl();

        Greeting proxy =
                (Greeting) Proxy.newProxyInstance(
                        Greeting.class.getClassLoader(),
                        new Class[]{Greeting.class},
                        new LoggingHandler(realObj));
        proxy.sayHello();
    }
}

