public abstract class Vehicle {      // Vehicle Class
    private final String vehicleModel;    
    private final double vehicleMileage;

    public Vehicle(String vehicleModel, double vehicleMileage){    //constructors to inititailize the variables in Objects
        this.vehicleModel = vehicleModel;
        this.vehicleMileage = vehicleMileage;
    }

    public String getVehicleModel(){   //Method to get the Model
        return vehicleModel;
    }

    public double getVehicleMileage(){      //Method to get the Mileage
        return vehicleMileage;
    }

    public abstract double getMilageCost();     //abstract Method
}

class Car extends Vehicle {

    private final double carMaintenanceCost = 0.1;          //given in Question

    public Car(String vehicleModel, double vehicleMileage){    //Constructor of Car class used to inititialize the variable
        super(vehicleModel, vehicleMileage);
    }

    @Override
    public double getMilageCost(){           //implementation of abstract Method for car
        return getVehicleMileage() * carMaintenanceCost;
    }
}

class Truck extends Vehicle {        //truck class extends the Vehicle class

    private final double truckMaintenanceCost = 0.2;        //value is given

    public Truck(String vehicleModel, double vehicleMileage){         //Constructors to initialize
        super(vehicleModel, vehicleMileage);
    }

    @Override
    public double getMilageCost(){          //implementation of abstract Method for truck
        return getVehicleMileage() * truckMaintenanceCost;
    }
}
