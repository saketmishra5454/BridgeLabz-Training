public class Main{
    public static void main(String[] args){
        Vehicle car1 = new Car("Sedan", 5000);         //this is a testcase given to us;
        System.out.printf("%.2f%n", car1.getMilageCost());  

        Vehicle truck1 = new Truck("Ashoka", 10000);         // testcase 1
        System.out.printf("%.2f%n", truck1.getMilageCost());

        Vehicle car2 = new Car("Tata Safari", 0);         // testcase 2;
        System.out.printf("%.2f%n", car2.getMilageCost());







    }
}
