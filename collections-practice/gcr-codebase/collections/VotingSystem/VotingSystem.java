import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        // votes count
        HashMap<String, Integer> votes = new HashMap<>();

        // maintain order of voting
        LinkedHashMap<String, Integer> votingOrder = new LinkedHashMap<>();

        // casting votes (simple demo)
        castVote(votes, votingOrder, "Alice");
        castVote(votes, votingOrder, "Bob");
        castVote(votes, votingOrder, "Alice");
        castVote(votes, votingOrder, "Charlie");

        System.out.println("Vote Count (HashMap): " + votes);
        System.out.println("Order of Votes (LinkedHashMap): " + votingOrder);

        // TreeMap sorts by candidate name
        TreeMap<String, Integer> sortedResult = new TreeMap<>(votes);
        System.out.println("Sorted Results (TreeMap): " + sortedResult);
    }

    static void castVote(Map<String, Integer> votes, Map<String, Integer> order, String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        order.put(candidate, order.getOrDefault(candidate, 0) + 1);
    }
}
