import java.util.Scanner;

public class UnitConverterUtilityClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // get input kilometers
        
        System.out.println("Enter kilometers to convert into miles ");
        double kilometers=sc.nextDouble();
        // calling convertKmToMiles() to convert km to miles
        double kilo2miles=convertKmToMiles(kilometers);
        System.out.println("Kilometers to mile is :"+ kilo2miles);

         // get input miles
        System.out.println("enter miles to convert into kilometers");
        double miles=sc.nextDouble();
        //convert miles to kilometers
        double miles2kilometers=convertMilesToKm(miles);
        System.out.println("miles into km is :"+miles2kilometers);

        // get input meters
        System.out.println("enter meters to convert into feet");
        double meters=sc.nextDouble();
        //convert meters to feet 
        double meters2feet=convertMetersToFeet(meters);
        System.out.println("meters into feet is :"+meters2feet);

         // get input feet
        System.out.println("enter feet to convert into meters");
        double feet=sc.nextDouble();
        //convert feet to meters
        double feet2meters=convertMetersToFeet(feet);
        System.out.println("meters into feet is :"+feet2meters);


    }
    // converting km to miles
    public static double convertKmToMiles(double km){
        double km2miles=0.621371;
        return km2miles*km;
    }
    // converting miles to km
    public static double convertMilesToKm(double miles){
        double miles2km=1.60934;
        return miles2km*miles;
    }
    //converting meters to feet
    public static double convertMetersToFeet(double meter){
        double meters2feet=3.28084;
        return meters2feet*meter;
    }
    // converting feet to meters
    public static double convertFeetToMeters(double feet){
        double feet2meters=0.3048;
        return feet2meters*feet;
    }

}
