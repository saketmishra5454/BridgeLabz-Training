package exceptionHandling;

public class ArrayCheck {

    public static void main(String[] args) {

        try {

            // Initializing array
            int[] arr = {10, 20, 30, 40};

            // Index value (can be changed)
            int index = 5;

            // Accessing array element
            System.out.println("Value: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // When index is wrong
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {

            // When array is not created
            System.out.println("Array is not initialized!");
        }
    }
}

