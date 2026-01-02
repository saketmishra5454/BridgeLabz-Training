//Vehicle Regitration System with Keywords: this, static, final, instanceof

public class Vehicle {      // Vehicle class
    static int registrationFee;
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){        // constructor using this keyword
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(int newRegistrationFee){         //    static method to update registration fee
       Vehicle.registrationFee = newRegistrationFee;
      

    }
    public void displayVehicleDetails(){        // instance method to display vehicle details
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    
    public static void main(String[] args){          // main method
        Vehicle v1 = new Vehicle("Saket Mishra", "Car", "REG5678");
        Vehicle v2 = new Vehicle("AdityaRaj","Bike", "REG1234"); 

        Vehicle.updateRegistrationFee(500);  // initial registration fee

        if(v1 instanceof Vehicle){                         // validating using instanceof before processing
        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();
        } 
        Vehicle.updateRegistrationFee(700);                //   updating registration fee
        if(v2 instanceof Vehicle){        // validating using instanceof before processing
        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();
    }   
}
}

    
    

