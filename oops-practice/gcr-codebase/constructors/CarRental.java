// Program for Car Rental System using Default and Parameterized Constructors

class CarRental {

    // rental details
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // fixed price per day (assumed)

    // default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Standard Car";
        rentalDays = 1;
       
    }

    // parameterized constructor
   r
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
      
    }

    // method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // method to display rental details
    void displayRental() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + calculateTotalCost());
        System.out.println();            // for spacing
    }

    // main method
    public static void main(String[] args) {

        // using default constructor
        CarRental r1 = new CarRental();
        System.out.println("Default Rental Details:");
        r1.displayRental();

        // using parameterized constructor
        CarRental r2 = new CarRental("Suresh", "Honda City", 5);
        System.out.println("Parameterized Rental Details:");
        r2.displayRental();
    }
}
