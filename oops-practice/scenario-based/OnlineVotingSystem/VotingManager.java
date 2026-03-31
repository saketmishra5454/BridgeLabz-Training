package OnlineVotingSystem;



import java.util.List;

public class VotingManager implements ElectionService {

    @Override
    public void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException {
        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter " + voter.getName() + " has already cast a vote!");
        }

        // Logical Step: Link the vote to the candidate and mark the voter as "Done"
        candidate.incrementVote();
        voter.setHasVoted(true);
        System.out.println("Vote successfully cast for " + candidate.getName() + " by " + voter.getName());
    }

    @Override
    public void declareResults(List<Candidate> candidates) {
        System.out.println("\n--- Election Results ---");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " (" + c.getParty() + "): " + c.getVoteCount() + " votes");
        }
    }
}
