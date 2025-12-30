class MovieTicketBooking     {
    String movieName;
    String seatNumber;
    double price;
    boolean booked = false;

    // Method to book ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        if (!booked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            booked = true;

            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    // Method to display ticket details
    void displayTicket() {
        if (!booked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicketBooking ticket = new MovieTicketBooking();

        ticket.displayTicket();
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.displayTicket();

        System.out.println();

        MovieTicketBooking ticket2 = new MovieTicketBooking();
        ticket2.bookTicket("Dragon", "A10", 120.0);
        System.out.println("Price: $" + ticket2.price);
    }
}
