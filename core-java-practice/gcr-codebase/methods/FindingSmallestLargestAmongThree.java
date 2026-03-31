import java.util.Scanner;
public class FindingSmallestLargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest among them:");
        int num1 = sc.nextInt();                // Input num1 numbers
        int num2 = sc.nextInt();              // Input num2 numbers
        int num3 = sc.nextInt();                            // Input num3 numbers
        FindingSmallestLargestAmongThree obj = new FindingSmallestLargestAmongThree();                 // Create object of the class
        obj.findLargestAndSmallest(num1, num2, num3);             // Method call to find the largest number
    

    }

    public void findLargestAndSmallest(int a, int b, int c) {       // Method to find the largest number among three numbers
    int largest = a;
    int smallest = a;

    if (b > largest) {        // Finding largest number
        largest = b;
    }
    if (c > largest) {
        largest = c;
    }

    if (b < smallest) {                 // Finding smallest number
        smallest = b;
    }
    if (c < smallest) {
        smallest = c;
    }

    System.out.println("Largest number is: " + largest);
    System.out.println("Smallest number is: " + smallest);
}

}