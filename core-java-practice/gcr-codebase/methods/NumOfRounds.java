
import java.util.Scanner;
public class NumOfRounds  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Rounds taken by athlete based on perimeter:"); 
        int distancesInKm = 5;           // Distance  covered by athlete in Km given in Question
        System.out.println("Enter the dimensions of triangle:");
        int base = sc.nextInt();         // Input base of triangle
        int altitude = sc.nextInt();      // Input altitude of triangle
        int hypotenuse = sc.nextInt();          // Input hypotenuse of triangle

        int perimeter = base + altitude + hypotenuse;

        NumOfRounds obj = new NumOfRounds();
        int totalRounds = obj.calNumOfRounds(distancesInKm, perimeter);    // Method call to calculate number of rounds
        System.out.println("Total Rounds completed by athlete is " + totalRounds);

    }

        public int calNumOfRounds(int distancesInKm, int perimeter) {             // Method to calculate number of rounds         
            int Rounds = ((distancesInKm*1000) / perimeter);
            return Rounds;
    
        }
}
