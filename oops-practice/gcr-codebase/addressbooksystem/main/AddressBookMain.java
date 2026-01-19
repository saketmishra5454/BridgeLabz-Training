package addressbooksystem.main;

import addressbooksystem.model.Contact;
import addressbooksystem.service.AddressBookService;
import java.util.Scanner;

public class AddressBookMain{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();
        
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    service.addContact(promptForContact(sc));
                    break;
                case 2:
                    service.getAllContacts().forEach(System.out::println);
                    break;
                case 3:
                    running = false;
                    break;
            }
        }
    }

    private static Contact promptForContact(Scanner sc) {
        System.out.print("First Name: "); String fn = sc.nextLine();
        System.out.print("Last Name: "); String ln = sc.nextLine();
        System.out.print("Address: "); String addr = sc.nextLine();
        System.out.print("City: "); String city = sc.nextLine();
        System.out.print("State: "); String state = sc.nextLine();
        System.out.print("Zip: "); String zip = sc.nextLine();
        System.out.print("Phone: "); String ph = sc.nextLine();
        System.out.print("Email: "); String em = sc.nextLine();
        
        return new Contact(fn, ln, addr, city, state, zip, ph, em);
    }
}
