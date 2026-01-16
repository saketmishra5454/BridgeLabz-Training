package OnlineVotingSystem;

public class Voter {         // Voter class
	private String voterId;
	private String name;
	public boolean hasVoted;
	
	public Voter(String string, String name) {  //constructors
		this.voterId = string;
		this.name = name;
		this.hasVoted = false;      //initialize hasVoted as a false;
	}
	
	public String getVoterId() {
		return voterId;
	}
	public String getName() {
		return name;
	}
	public boolean hasVoted() {
		return hasVoted;
	}

	public void setHasVoted(boolean hasVoted) { 
        this.hasVoted = hasVoted; 
    }

}
