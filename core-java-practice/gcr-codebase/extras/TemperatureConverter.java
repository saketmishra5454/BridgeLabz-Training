import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    // Convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        switch (choice) {
            case 1:
                double celsius = fahrenheitToCelsius(temp);
                System.out.println("Temperature in Celsius: " + celsius);
                break;

            case 2:
                double fahrenheit = celsiusToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
