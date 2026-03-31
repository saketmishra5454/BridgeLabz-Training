import java.util.Scanner;

public class ElectionPollingBooth {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // tallying the votes for 3 candidates
        int cand1 = 0, cand2 = 0, cand3 = 0;
        
        System.out.println("=== ELECTION DAY SYSTEM BOOTED ===");
        
        while (true) {
            System.out.print("\nEnter your age to verify (or type -1 to close booth): ");
            int age = reader.nextInt();
            
            // special code to exit the program
            if (age == -1) {
                System.out.println("Shutting down booth... generating final report.");
                break;
            }
            
            // check for eligibility 
            if (age >= 18) {
                System.out.println("Access Granted. Please cast your vote:");
                System.out.println("1. Candidate A | 2. Candidate B | 3. Candidate C");
                System.out.print("Your choice: ");
                int vote = reader.nextInt();
                
                // record the vote - switch makes this cleaner
                switch (vote) {
                    case 1: cand1++; break;
                    case 2: cand2++; break;
                    case 3: cand3++; break;
                    default: System.out.println("Invalid choice! Vote wasted lol.");
                }
                System.out.println("Thank you for voting!");
            } else {
                System.out.println("Sorry, you are underaged. Cant vote yet!");
            }
        }
        
        // Final Results
        System.out.println("\n--- FINAL VOTE COUNT ---");
        System.out.println("Candidate A: " + cand1);
        System.out.println("Candidate B: " + cand2);
        System.out.println("Candidate C: " + cand3);
    }
}