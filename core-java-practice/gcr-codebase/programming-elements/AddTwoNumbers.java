import java.util.Scanner;
public class AddTwoNumbers {
    //Write a program that takes two numbers as input from the user and prints
//their sum.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");       // Taking input from user of first number
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();      // Taking input from user of second number
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
    }



    
}
