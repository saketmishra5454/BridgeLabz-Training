import java.util.Scanner;

public class NumberCheckAndCompare {

    // Method to check whether number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check whether number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {

        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println(); // small gap

        // Checking each number
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            System.out.print("Number " + num + " is ");

            if (isPositive(num)) {

                // If positive, check even or odd
                if (isEven(num)) {
                    System.out.println("positive and even.");
                } else {
                    System.out.println("positive and odd.");
                }

            } else {
                // If negative
                System.out.println("negative.");
            }
        }

        System.out.println(); // gap before comparison

        // Comparing first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close(); 
    }
}

