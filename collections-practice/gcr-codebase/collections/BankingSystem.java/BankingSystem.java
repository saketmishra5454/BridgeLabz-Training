import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        // accountNumber -> Balance
        HashMap<String, Integer> accounts = new HashMap<>();
        accounts.put("AC101", 5000);
        accounts.put("AC102", 3000);
        accounts.put("AC103", 8000);

        // sorted by balance
        TreeMap<Integer, String> sortByBalance = new TreeMap<>();
        for (String acc : accounts.keySet()) {
            sortByBalance.put(accounts.get(acc), acc);
        }
        System.out.println("Sorted by balance: " + sortByBalance);

        // withdrawal queue
        Queue<String> withdrawQueue = new LinkedList<>();
        withdrawQueue.add("AC102");
        withdrawQueue.add("AC101");

        while (!withdrawQueue.isEmpty()) {
            String acc = withdrawQueue.remove();
            accounts.put(acc, accounts.get(acc) - 1000); // deducting simple
        }

        System.out.println("Accounts after withdrawals: " + accounts);
    }
}
