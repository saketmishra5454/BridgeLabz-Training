import java.util.Scanner;
public class SumNaturalCompareWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Checking whether the number is natural or not
        if (num <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {

            int totalWhile = 0;
            int i = 1;

            // Correct while loop condition
            while (i <= num) {             // Sum of first n natural no. using while loop
                totalWhile += i;
                i++;
            }
            int totalFormula = num * (num + 1) / 2;         // Using the formula for sum of first n naturalno.
            System.out.println("Sum using while loop: " + totalWhile);
            System.out.println("Sum using formula: " + totalFormula);

            if (totalFormula == totalWhile) {           // Comparing both results
                System.out.println("Yes, both results are the same");
            } else {
                System.out.println("No, results are different");
            }
        }

        sc.close();
    }
}
