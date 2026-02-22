package streamApi.Insurance_claimavailability;

import java.util.*;

public class Claim {

    private String claimId;
    private String claimType;
    private double amount;

    public Claim(String claimId, String claimType, double amount) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimId() {
        return claimId;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return claimId + " - " + claimType + " - " + amount;
    }
}
