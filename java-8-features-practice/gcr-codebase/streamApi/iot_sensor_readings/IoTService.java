package streamApi.iot_sensor_readings;

import java.util.*;
import java.util.stream.*;

public class IoTService {

    public static void main(String[] args) {

        List<SensorReading> readings = Arrays.asList(
                new SensorReading("S1", 60.5),
                new SensorReading("S2", 82.3),
                new SensorReading("S3", 75.0),
                new SensorReading("S4", 91.7),
                new SensorReading("S5", 45.2)
        );

        double threshold = 75.0;

        List<SensorReading> result = readings.stream().filter(x->x.getValue()>threshold)
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
