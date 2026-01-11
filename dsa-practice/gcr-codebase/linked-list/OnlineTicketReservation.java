class TicketNode {    // Node for Circular Singly Linked List
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int id, String customer, String movie,
                      String seat, String time) {            // Constructor taking all parameters
        this.ticketId = id;
        this.customerName = customer;
        this.movieName = movie;
        this.seatNumber = seat;
        this.bookingTime = time;
        this.next = null;
    }
}

class TicketReservationSystem {       // Circular Singly Linked List

    private TicketNode head = null;
    private TicketNode tail = null;
    private int count = 0;

    // Add new ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) { // first node
            head = tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        count++;
        System.out.println("Ticket Booked Successfully: " + id);
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = head, prev = tail;

        // Find the ticket
        do {
            if (curr.ticketId == id) break;
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        // If not found
        if (curr.ticketId != id) {
            System.out.println("Ticket not found.");
            return;
        }

        // One ticket case
        if (curr == head && curr == tail) {
            head = tail = null;
        }
        // Removing head
        else if (curr == head) {
            head = head.next;
            tail.next = head;
        }
        // Removing tail
        else if (curr == tail) {
            tail = prev;
            tail.next = head;
        }
        // Middle removal
        else {
            prev.next = curr.next;
        }

        count--;
        System.out.println("Ticket Removed: " + id);
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("Current Ticket Reservations:");
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);

        System.out.println("--------------------------------");
    }

    // Search by Customer Name or Movie
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        boolean found = false;
        TicketNode temp = head;

        do {                         // Search loop
            if (temp.customerName.equalsIgnoreCase(keyword)
                || temp.movieName.equalsIgnoreCase(keyword)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No matching tickets found.");
    }

    // Count total tickets
    public void ticketCount() {
        System.out.println("Total Booked Tickets: " + count);
    }

    // Helper method to display ticket details
    private void printTicket(TicketNode t) {
        System.out.println("Ticket ID     : " + t.ticketId);
        System.out.println("Customer Name : " + t.customerName);
        System.out.println("Movie Name    : " + t.movieName);
        System.out.println("Seat Number   : " + t.seatNumber);
        System.out.println("Booking Time  : " + t.bookingTime);
        System.out.println("-------------------------------");
    }
}

public class OnlineTicketReservation     {
    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();    // Create system instance

        system.addTicket(101, "Alice", "Avengers", "A10", "10:00 AM");  // Add tickets
        system.addTicket(102, "Bob", "Avatar", "B05", "11:30 AM");  // Add tickets 
        system.addTicket(103, "Charlie", "Avengers", "A11", "10:00 AM");      // Add tickets    

        System.out.println();
        system.displayTickets();

        System.out.println("Search by Customer:");      
           // Search by Customer
        system.searchTicket("Alice");

        System.out.println("Search by Movie:");
        system.searchTicket("Avengers");

        System.out.println();
        system.ticketCount();

        System.out.println("\nRemoving Ticket ID 102...");   
        // Remove a ticket
        system.removeTicket(102);

        System.out.println();
        system.displayTickets();
        system.ticketCount();
    }
}
