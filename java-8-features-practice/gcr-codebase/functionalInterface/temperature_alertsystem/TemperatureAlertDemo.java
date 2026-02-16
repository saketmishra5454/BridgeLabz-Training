package functionalInterface.temperature_alertsystem;

import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlertDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Threshold temperature
        double threshold = 37.5;

        // Predicate to check temperature
        Predicate<Double> alertCheck =
                temp -> temp > threshold;
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        // Check condition using predicate
        if (alertCheck.test(temp)) {
            System.out.println("ALERT! Temperature is high");

        } else {
            System.out.println("Temperature is normal");
        }
        sc.close();
    }
}
