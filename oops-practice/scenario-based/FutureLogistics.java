
import java.util.Scanner;

abstract class GoodsTransport {
    //protected attributes
    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    //3-argument Constructor
    public GoodsTransport(String transportId, String transportDate, int transportRating){
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    //  Getters and Setters
    public String getTransportId(){
        return transportId;
    }
    public void setTransportId(String transportId){
        this.transportId = transportId;
    }
    public String getTransportDate(){
        return transportDate;
    }
    public void setTransportDate(String transportDate){
        this.transportDate = transportDate;
    }
    public int getTransportRating(){
        return transportRating;
    }

    public void setTransportRating(int transportRating){
        this.transportRating = transportRating;
    }


    //abstract method
    public  abstract String vehicleSelection();


    public abstract  float calculateTotalCharge();
}


//+++++++++++++++++++++++++++++++BrickTransport Class+++++++++++++++++++++++++++++++++++++++++++++

class BrickTransport extends GoodsTransport {

    // private attributes
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    // 6-arguments Constructor
    public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize,
                          int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }
    // Getter and Setter
    public float getBrickSize(){
        return brickSize;
    }
    public void setBrickSize(float brickSize){
        this.brickSize = brickSize;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    // Vehicle Selection
    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";

        } else if (brickQuantity >= 300 && brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    // Caculate Total charges
    @Override
    public float calculateTotalCharge(){
        float price = brickPrice*brickQuantity;
        float tax = price * 0.3f;
        float discountPercentage = 0.0f;

        float vehiclePrice = 0.0f;


        if(this.transportRating == 5){
            discountPercentage = 0.20f;
        }
        else if(this.transportRating == 3 || this.transportRating == 4){
            discountPercentage = 0.10f;
        }

        float discount = price * discountPercentage;

        //Vehicle Price

        switch(this.vehicleSelection()){
            case "Truck":
                vehiclePrice = 1000;
                break;

            case "Lorry":
                vehiclePrice = 1700;
                break;

            case "MonsterLorry":
                vehiclePrice = 3000;
                break;


        }
        float totalCharge = (price+ vehiclePrice+ tax)-discount;

        return totalCharge;
    }
}

//++++++++++++++++++++++++++++++++++TimberTransport Class++++++++++++++++++++++++++++++++++++++++++
 class TimberTransport extends GoodsTransport {
     private float timberLength;
     private float timberRadius;
     private String timberType;
     private float timberPrice;

     public TimberTransport(String transportId,String transportDate,int transportRating,
                            float timberLength, float timberRadius, String timberType, float timberPrice){

         super(transportId,transportDate,transportRating);
         this.timberLength = timberLength;
         this.timberRadius = timberRadius;
         this.timberType = timberType;
         this.timberPrice = timberPrice;
     }

     public float getTimberLength() {
         return timberLength;
     }
     public void setTimberLength(float timberLength) {
         this.timberLength = timberLength;
     }

     public float getTimberPrice() {
         return timberPrice;
     }
     public void setTimberPrice(float timberPrice) {
         this.timberPrice = timberPrice;
     }

     public float getTimberRadius(){
         return timberRadius;
     }
     public void setTimberRadius(float timberRadius){
         this.timberRadius = timberRadius;
     }

     public String getTimberType() {
         return timberType;
     }
     public void setTimberType(String timberType) {
         this.timberType = timberType;
     }
     // Method for vehicle selection
     @Override
     public String vehicleSelection(){
         float area = 2*3.147f*timberRadius*timberLength;

         if(area<250){
             return "Truck";
         }
         else if(area>=250 && area<= 400){
             return "Lorry";
         }
         else{
             return "MonsterLorry";
         }
     }

     //method for CalculateTotal Charges
     @Override
     public float calculateTotalCharge(){
         float volume = 3.147f* timberRadius * timberRadius * timberLength;
         float timberRate = 0.0f;

         if(timberType.equalsIgnoreCase("Premium")){
             timberRate = 0.25f;
         }
         else if(timberType.equalsIgnoreCase("NonPremium")){
             timberRate = 0.15f;
         }
         else{
             System.out.println("Invalid Timber Type");
         }
         float price = volume * timberPrice * timberRate;

         float tax = price * 0.3f;

// Deciding the discount based on Ratings
         float discountPercentage = 0.0f;

         if(this.transportRating == 5){
             discountPercentage = 0.20f;
         }
         else if(transportRating==3 || transportRating==4){
             discountPercentage = 0.10f;
         }

         float discount = price * discountPercentage;

         // Deciding the VehiclePrice based on VehicleType

         float vehiclePrice = 0.0f;

         switch(this.vehicleSelection()){
             case "Truck":
                 vehiclePrice = 1000;

             case "Lorry":
                 vehiclePrice = 1700;

             case "MonsterLorry":
                 vehiclePrice = 3000;
         }
         float totalCharge = ((price)+vehiclePrice+tax)-discount;

         return totalCharge;

     }
 }

 //+++++++++++++++++++++++++++++++++++++++++++Utility CLass++++++++++++++++++++++++++++++++++++++++++++

 class Utility {

     // method for parse details
     public GoodsTransport parseDetails(String input){

         String[] data = input.split(":");

         String id = data[0];
         String date = data[1];
         int rating = Integer.parseInt(data[2]);
         String type = data[3];

         if(type.equalsIgnoreCase("BrickTransport")){

             float size = Float.parseFloat(data[4]);
             int quantity = Integer.parseInt(data[5]);
             float price = Float.parseFloat(data[6]);


             return new BrickTransport(id,date, rating, size, quantity, price);
         }

         else if(type.equalsIgnoreCase("TimberTransport")){

             float length = Float.parseFloat(data[4]);
             float radius = Float.parseFloat(data[5]);
             String timbertype = data[6];
             float timberPrice = Float.parseFloat(data[7]);

             return new TimberTransport(id,date, rating, length,radius, timbertype, timberPrice);

         }
         return null;
     }

     // method to verify transportId is valid or not
     public boolean validateTransportId(String transportId){
         String regex = "^RTS[0-9]{3}[A-Z]{1}$";

         if(!transportId.matches(regex)){
             System.out.println("TransportId Id "+ transportId + " is invalid");
             System.out.println("Please provide a valid record");
             return false;
         }
         return true;
     }

     //method to find the Object Type
     public String findObjectType(GoodsTransport goodsTransport){

         if(goodsTransport instanceof BrickTransport){
             return "BrickTransport";
         }

         else if(goodsTransport instanceof TimberTransport){
             return "TimberTransport";
         }
         return "Unknown";
     }
 }

 //===============================================FutureLogistic Class+================================

public class FutureLogistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Utility utility = new Utility();        //create an object of class utility

        System.out.println("Enter the Goods Transport details");

        String input = sc.nextLine();

        String data[] = input.split(":");

        String transportId = data[0];

        // Validate ID
        if (!utility.validateTransportId(transportId)) {

            //  System.out.println("Please provide a valid record");
            return;
        }

        // Parse Data
        GoodsTransport obj = utility.parseDetails(input);

        String type = utility.findObjectType(obj);

        // Display Common Details
        System.out.println();
        System.out.println("Transporter id : " + obj.getTransportId());
        System.out.println("Date of transport : " + obj.getTransportDate());
        System.out.println("Rating of the transport : " + obj.getTransportRating());

        // If Brick
        if (type.equals("BrickTransport")) {

            BrickTransport bt = (BrickTransport) obj;

            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());

            System.out.println("Vehicle for transport : " + bt.vehicleSelection());

            System.out.println("Total charge : " + bt.calculateTotalCharge());
        }

        // If Timber
        else if (type.equals("TimberTransport")) {

           TimberTransport tt = (TimberTransport) obj;

            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());

            System.out.println("Vehicle for transport : " + tt.vehicleSelection());

            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }
        sc.close();
    }
}



