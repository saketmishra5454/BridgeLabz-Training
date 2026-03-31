package oceanfleet;
import java.util.*;

public class VesselUtil {

    // List to store vessels
    private List<Vessel> vesselList = new ArrayList<>();
    // Getter
    public List<Vessel> getVesselList() {
        return vesselList;
    }
    // Setter
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }
    // Requirement 1: Add vessel
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    // Requirement 2: Search by ID
    public Vessel getVesselById(String vesselId) {

        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }

        return null; // If not found
    }
    // Requirement 3: Get high performance vessels
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> result = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return result;
        }

        // Find maximum speed
        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > maxSpeed) {
                maxSpeed = v.getAverageSpeed();
            }
        }
        // Add vessels having max speed
        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                result.add(v);
            }
        }
        return result;
    }
}
