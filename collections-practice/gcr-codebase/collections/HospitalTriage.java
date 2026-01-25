import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // priority queue with custom comparator for severity (big first)
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a, b) -> b.severity - a.severity
        );

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        // treating patients by priority
        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println("Treating: " + p.name + " (Severity:" + p.severity + ")");
        }
    }
}
