package junit.temperatureconverter;

public class TemperatureConverter {

    //method to convert celcius to Fahrenheit
    public  double cToF(double c){
        return (c*9/5)+32;
    }
    //method to convert Fahrenheit to Celcius
    public double fToC(double f){
        return (f-32)*5/9;
    }
}
