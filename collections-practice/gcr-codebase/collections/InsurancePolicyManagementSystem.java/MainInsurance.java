import java.time.LocalDate;

public class MainInsurance {
    public static void main(String[] args) {
        PolicyManager pm = new PolicyManager();

        pm.addPolicy(new Policy("P101", "Amit", LocalDate.now().plusDays(5), "Health"));
        pm.addPolicy(new Policy("P102", "Rohan", LocalDate.now().plusDays(40), "Auto"));
        pm.addPolicy(new Policy("P103", "Amit", LocalDate.now().minusDays(2), "Home"));

        System.out.println(pm.getPolicyByNumber("P101"));
        pm.listExpiringIn30Days();
        pm.listByHolder("Amit");

        pm.removeExpired();
    }
}
