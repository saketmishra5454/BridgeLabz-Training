package OnlineVotingSystem;

public class Candidate {
	private String name;
	private String candidateId;
	private String party;
	private int voteCount;
	
	public Candidate(String candidateId, String name, String party) {
        this.candidateId = candidateId;
        this.name = name;
        this.party = party;
        this.voteCount = 0;  
        
	}
	public void incrementVote() {
		voteCount++;
	}
	
	public String getCandidateId() {
		return candidateId;
	}
	public String getParty() {
		return party;
	}
	public String getName() {
		return name;
	}
	public int getVoteCount() {
		return voteCount;
	}
        

}
