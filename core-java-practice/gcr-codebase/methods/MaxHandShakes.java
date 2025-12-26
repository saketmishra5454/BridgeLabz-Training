import java.util.Scanner;
public class MaxHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:"); 
        int numofStudent = sc.nextInt();               // Input number of students
        MaxHandShakes obj = new MaxHandShakes();
        int maxHandShakes = obj.calculateMaxHandShakes(numofStudent);
        System.out.println("Maximum Handshakes possible is " + maxHandShakes);  
    }

        public int calculateMaxHandShakes(int n) {                  // Method to calculate maximum handshakes
            int maxHandShakes = (n * (n - 1)) / 2;             // Formula to calculate maximum handshakes
            return maxHandShakes;
        }

}
