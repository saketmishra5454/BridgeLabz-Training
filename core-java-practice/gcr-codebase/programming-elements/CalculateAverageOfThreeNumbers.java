
import java.util.Scanner;
class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for first number
        System.out.println("Enter first number:");
        double first_no = sc.nextDouble();

        // taking input for second number
        System.out.println("Enter second number:");
        double second_no = sc.nextDouble();
        // taking input for third number
	    System.out.println("Enter third number:");
        double third_no = sc.nextDouble();

        //calculating result
	    double average = (first_no + second_no + third_no) / 3;
        System.out.println("Average of the three numbers is: " + average);
    }
}