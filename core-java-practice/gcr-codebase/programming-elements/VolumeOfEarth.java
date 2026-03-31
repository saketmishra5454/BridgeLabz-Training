public class VolumeOfEarth {
       public static void main(String[] args) {
        
       double Earth_radius = 6378.0;             // Radius of Earth in kilometers
       double EarthVolumekm = (4.0/3.0)*Math.PI * Math.pow(Earth_radius,3);       // Volume formula for a sphere
       
       double VolumeMiles = EarthVolumekm * 0.239913;
      
        System.out.println("The volume of earth in cubic Kilometers is " + EarthVolumekm + " and cubic miles is " + VolumeMiles);
    }
}

