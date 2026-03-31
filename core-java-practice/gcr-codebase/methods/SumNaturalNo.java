import java.util.Scanner;
public class SumNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number to calculate sum of natural numbers up to that number:");
        int num = sc.nextInt();                          // Input natural number
        SumNaturalNo obj = new SumNaturalNo();              // Create object of the class
        int sum = obj.calculateSum(num);         // Method call to calculate sum of natural numbers
        System.out.println("Sum of natural numbers up to " + num + " is " + sum);
    }

    public int calculateSum(int n) {        // Method to calculate sum of natural numbers up to n
        int sum = (n * (n + 1)) / 2;               // Formula to calculate sum
        return sum;
    }
    
}
