import java.util.Scanner;

public class FactorsOfANumberUsingWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // checking if number is positive or not
        if (number <= 0) {
            System.out.println("Plz enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are: ");

            // loop from 1 till number
            int i = 1;
            while (i < number) {
                
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
           
        }
}
}
