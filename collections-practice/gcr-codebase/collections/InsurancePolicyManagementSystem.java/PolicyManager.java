import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {
    
    // for fast lookup
    HashMap<String, Policy> hashMap = new HashMap<>();
    
    // to maintain insertion order
    LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();
    
    // sorted by expiry date (TreeMap keys are expiry dates)
    TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    public void addPolicy(Policy p) {
        // storing in hashMap and linkedHashMap
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);

        // storing in treeMap
        treeMap.putIfAbsent(p.expiry, new ArrayList<>());
        treeMap.get(p.expiry).add(p);
    }

    public Policy getPolicyByNumber(String number) {
        return hashMap.get(number);
    }

    public void listExpiringIn30Days() {
        System.out.println("Expiring in next 30 days:");
        LocalDate today = LocalDate.now();
        for (LocalDate date : treeMap.keySet()) {
            long diff = ChronoUnit.DAYS.between(today, date);
            if (diff >= 0 && diff <= 30) {
                for (Policy p : treeMap.get(date)) {
                    System.out.println(p);
                }
            }
        }
    }

    public void listByHolder(String name) {
        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    public void removeExpired() {
        LocalDate today = LocalDate.now();
        List<String> toRemove = new ArrayList<>();

        for (Policy p : hashMap.values()) {
            if (p.expiry.isBefore(today)) {
                toRemove.add(p.policyNumber);
            }
        }

        // remove from all maps
        for (String k : toRemove) {
            Policy p = hashMap.remove(k);
            linkedHashMap.remove(k);
            treeMap.get(p.expiry).remove(p);
        }
    }
}
