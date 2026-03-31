package exceptionHandling;

public class NestedTry {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        int index = 1;
        int div = 0;

        try {

            // Outer try for array
            try {

                // Access element
                int value = arr[index];

                // Division
                int result = value / div;

                System.out.println(result);

            } catch (ArithmeticException e) {

                // Inner catch
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            // Outer catch
            System.out.println("Invalid array index!");
        }
    }
}
