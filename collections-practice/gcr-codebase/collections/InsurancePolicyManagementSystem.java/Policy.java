import java.time.LocalDate;

class Policy {
    String policyNumber;
    String holderName;
    LocalDate expiry;
    String type;

    public Policy(String policyNumber, String holderName, LocalDate expiry, String type) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiry = expiry;
        this.type = type;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiry + " | " + type;
    }
}
