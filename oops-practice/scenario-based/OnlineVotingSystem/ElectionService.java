package OnlineVotingSystem;

import java.util.List;

public interface ElectionService {
    void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException;
    void declareResults(List<Candidate> candidates);
}