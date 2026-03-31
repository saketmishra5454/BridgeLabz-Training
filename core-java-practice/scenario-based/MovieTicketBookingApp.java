import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // asking how many customers 
        System.out.print("Enter number of customers: ");
        int customerCount = scanner.nextInt();
        scanner.nextLine(); // buffer clear

        // looping through customers 
        for (int customer = 1; customer <= customerCount; customer++) {

            System.out.println("\nCustomer " + customer + " Booking Details");

            //  movie type input 
            System.out.print("Enter movie type (Regular / 3D / IMAX): ");
            String movieType = scanner.nextLine();

            //  seat type input 
            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = scanner.nextLine();

            //  snacks choice 
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = scanner.nextLine();

            int ticketPrice = 0;
            int snacksPrice = 0;

            // deciding base price using switch
            switch (movieType.toLowerCase()) {

                case "regular":
                    ticketPrice = 150;
                    break;

                case "3d":
                    ticketPrice = 200;
                    break;

                case "imax":
                    ticketPrice = 300;
                    break;

                default:
                    System.out.println("Invalid movie type! Default price applied.");
                    ticketPrice = 150;
            }

            // adjusting price using if 
            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 50;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 0;
            } else {
                System.out.println("Invalid seat type! Silver assumed.");
            }

            //  snacks cost
            if (snacksChoice.equalsIgnoreCase("yes")) {
                snacksPrice = 100;
            }

            int totalAmount = ticketPrice + snacksPrice;

            // inal bill output 
            System.out.println("Movie Type  : " + movieType);
            System.out.println("Seat Type   : " + seatType);
            System.out.println("Snacks Cost : ₹" + snacksPrice);
            System.out.println("Total Bill  : ₹" + totalAmount);

        }

        scanner.close();
    }
}
