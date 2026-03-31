
import java.util.Scanner;
class CelsiustoFahrenheitConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius degree :");
        double celsiusDegree = sc.nextDouble();                         // Taking input for celsius degree
        double fahrenheitDegree = (celsiusDegree*(9.0/5))+32;
        //System.out.println("Temperature in "+celisusDegree+" °C is equals to "+ FahrenheitDegree+"°F");
        
           System.out.printf(
            "Temperature in %.2f °C is equal to %.2f °F",          // For output to 2 decimal places
            celsiusDegree, fahrenheitDegree
        );
    }
}