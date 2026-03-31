package food_delivering_ordersystem;

public class Agent {
    private String agentId;
    private String agentName;
    private boolean isAvailable;
    private String currentVehicle;


    public Agent(String agentId, String agentName, String currentVehicle, boolean isAvailable) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.currentVehicle = currentVehicle;
        this.isAvailable = isAvailable;
    }

    //Getter and Setter

    public String getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getCurrentVehicle() {
        return currentVehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setCurrentVehicle(String currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

// to string method to print

    @Override
    public String toString() {
        return "Agent{" +
                "agentId='" + agentId + '\'' +
                ", agentName='" + agentName + '\'' +
                ", isAvailable=" + isAvailable +
                ", currentVehicle='" + currentVehicle + '\'' +
                '}';
    }
}
