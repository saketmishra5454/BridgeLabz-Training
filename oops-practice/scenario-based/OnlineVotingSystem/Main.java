package OnlineVotingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Setup Candidates
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("C1", "Alice", "Tech Party"));
        candidates.add(new Candidate("C2", "Bob", "Java Party"));

        // 2. Setup Voters
        Voter v1 = new Voter("V101", "Saket");
        
        ElectionService election = new VotingManager();

        try {
            // First attempt
            election.castVote(v1, candidates.get(1)); // Voting for Bob
            
            // Second attempt (This should trigger the exception)
            election.castVote(v1, candidates.get(0)); 
            
        } catch (DuplicateVoteException e) {
            System.out.println("ALERT: " + e.getMessage());
        }

        // 3. Final Results
        election.declareResults(candidates);
    }
}
