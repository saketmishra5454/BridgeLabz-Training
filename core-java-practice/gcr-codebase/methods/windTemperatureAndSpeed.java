import java.util.Scanner;
public class windTemperatureAndSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wind speed and temperature25:");
        double windSpeed = sc.nextDouble();                // Input wind speed
        double temperature = sc.nextDouble();              // Input temperature
        windTemperatureAndSpeed obj = new windTemperatureAndSpeed();                 // Create object of the class
        obj.calculateWindChill(temperature, windSpeed);             // Method call to calculate wind chill
    }

    public void calculateWindChill(double temperature, double windSpeed) {       // Method to calculate wind chill
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);        // Calculate wind chill

        System.out.printf("The wind chill index is: %.2f\n", windChill);
    }
    
}
