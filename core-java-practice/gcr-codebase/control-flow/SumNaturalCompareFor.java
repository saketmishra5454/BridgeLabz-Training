import java.util.Scanner;
public class SumNaturalCompareFor {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Create Scanner object
        System.out.print("Enter the number: ");
        int num = sc.nextInt();        

        // Checking whether the number is natural or not
        if (num <= 0) {
            System.out.println("Please enter a valid natural number");
        }
        else {

            int totalFor = 0;
            for (int i = 1;i <=num; i++)      // Sum of first n natural no. using for loop
                totalFor += i;
                
            

            int totalFormula = num * (num + 1) / 2;                // Using the formula for sum of first n naturalno.

            System.out.println("Sum using for loop: " + totalFor);
            System.out.println("Sum using formula: " + totalFormula);

            if (totalFormula == totalFor) {                       // Comparing both results
                System.out.println("Yes, both results are the same");
            } 
            else {
                System.out.println("No, results are different");
            }
        }
}
}



