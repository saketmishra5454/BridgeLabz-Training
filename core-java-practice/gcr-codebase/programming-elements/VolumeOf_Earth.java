public class VolumeOf_Earth {
       public static void main(String[] args) {
        
       double Earth_radius = 6378.0;             // Radius of Earth in kilometers
       double EarthVolume_km = (4.0/3.0)*Math.PI * Math.pow(Earth_radius,3);       // Volume formula for a sphere
       
       double Volume_miles = EarthVolume_km * 0.239913;           
      
        System.out.println("The volume of earth in cubic Kilometers is " + EarthVolume_km + " and cubic miles is " + Volume_miles);
    }
}

