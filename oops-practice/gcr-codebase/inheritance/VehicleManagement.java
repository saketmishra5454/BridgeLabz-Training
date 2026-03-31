package inheritance;
// VehicleManagement demonstrates inheritance and interface implementation
interface Refuelable{           //Interface
    void refuel();
}


class Vehicle{          //Base Class
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed,String model){        //Parameterized Constructor
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void displayDetails(){               //Method to display vehicle details
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class ElectricVehicle extends Vehicle {     //Derived Class
    public ElectricVehicle(int maxSpeed, String model)
    {
        super(maxSpeed, model);            //Calling parent class constructor
    }   

    public void charge(){
        System.out.println("Electric vehicle is charging");
    }

}
class PetrolVehicle extends Vehicle implements Refuelable{         //Derived Class
    public PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed,model);           //Calling parent class constructor
    }
    
    public void refuel(){                          //Implementing method from Refuelable interface
        System.out.println("Petrol vehicle is refueling");                              
    }

}



public class VehicleManagement {           //Main Class
    public static void main(String[] args){
        PetrolVehicle pv = new PetrolVehicle(200,"Toyota");         //Creating object of PetrolVehicle class
        pv.displayDetails();                     //Displaying petrol vehicle details
        pv.refuel();
        System.out.println();
        ElectricVehicle ev = new ElectricVehicle(180,"Tesla");         //Creating object of ElectricVehicle class
        ev.displayDetails();                        //Displaying electric vehicle details
        ev.charge();
    }

}
