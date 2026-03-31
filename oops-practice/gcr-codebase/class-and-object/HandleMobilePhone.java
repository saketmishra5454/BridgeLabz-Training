class HandleMobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    HandleMobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile details
    void displayDetails() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        HandleMobilePhone m1 = new HandleMobilePhone("VIVO", "VIVO V29", 15999.0);
        HandleMobilePhone m2 = new HandleMobilePhone("ONE PLUS", "ONE PLUS nord4", 39999.0);
        HandleMobilePhone m3 = new HandleMobilePhone("APPLE", "iphone pro16", 79999.0);

        m1.displayDetails();
        m2.displayDetails();
        m3.displayDetails();
    }
}
