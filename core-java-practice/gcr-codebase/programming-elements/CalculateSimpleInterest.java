

import java.util.Scanner;
class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           // taking input from user
        System.out.println("Enter Principal:");       // Taking input for principal amount
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");    // Taking input for rate of interest
        double rate = sc.nextDouble();
        System.out.println("Enter Time (in years):");    // Taking input for time period in years
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;        // Calculate Simple Interest by using formula
        System.out.println("Simple Interest is: " + interest);
    }
}