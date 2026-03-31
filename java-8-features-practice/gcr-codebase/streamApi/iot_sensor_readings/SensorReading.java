package streamApi.iot_sensor_readings;

public class SensorReading {

    private String sensorId;
    private double value;

    public SensorReading(String sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sensor: " + sensorId + " | Value: " + value;
    }
}