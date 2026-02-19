package energy_consumption_monitor;

public class EnergyRecord {

    private String readingId;
    private String date;
    private double energyUsed;
    private String deviceName;

    // No-argument constructor
    public EnergyRecord() {
    }

    // Four-argument constructor
    public EnergyRecord(String readingId, String date,
                        double energyUsed, String deviceName) {
        this.readingId = readingId;
        this.date = date;
        this.energyUsed = energyUsed;
        this.deviceName = deviceName;
    }

    // Getter and Setter for readingId
    public String getReadingId() {
        return readingId;
    }

    public void setReadingId(String readingId) {
        this.readingId = readingId;
    }

    // Getter and Setter for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter for energyUsed
    public double getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(double energyUsed) {
        this.energyUsed = energyUsed;
    }

    // Getter and Setter for deviceName
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    @Override
    public String toString() {
        return readingId + " | " + date + " | "
                + deviceName + " | " + energyUsed + " kWh";
    }
}
