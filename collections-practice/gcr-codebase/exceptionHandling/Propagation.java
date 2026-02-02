package exceptionHandling;

public class Propagation {

    // This method creates exception
    static void method1() {

        int a = 10 / 0;   // error
    }

    // Calling method1
    static void method2() {

        method1();
    }

    public static void main(String[] args) {

        try {

            // Starting method call
            method2();

        } catch (ArithmeticException e) {

            // Final handling
            System.out.println("Handled exception in main");
        }
    }
}
