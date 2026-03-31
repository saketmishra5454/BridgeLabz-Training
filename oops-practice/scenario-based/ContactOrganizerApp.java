import java.util.ArrayList;
import java.util.List;

// Custom Exception for invalid phone number
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Contact class
class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// Contact Organizer class
class ContactOrganizer {

    private List<Contact> contacts = new ArrayList<>();

    // add contact
    public void addContact(String name, String phoneNumber)
            throws InvalidPhoneNumberException {

        // validate phone number
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException(
                    "Phone number must be exactly 10 digits");
        }

        // check duplicate based on phone number
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }

        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }

    // delete contact by phone number
    public void deleteContact(String phoneNumber) {

        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // search contact by name
    public void searchContact(String name) {

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println("Name: " + c.getName());
                System.out.println("Phone: " + c.getPhoneNumber());
                return;
            }
        }

        System.out.println("Contact not found.");
    }
}

// Main class
public class ContactOrganizerApp {

    public static void main(String[] args) {

        ContactOrganizer organizer = new ContactOrganizer();

        try {
            organizer.addContact("Saket", "9876543210");
            organizer.addContact("Abhisek", "9123456789");

            // duplicate phone number
            organizer.addContact("Aditya", "9876543210");

            // invalid phone number
            organizer.addContact("Sneha", "12345");

        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        organizer.searchContact("Riya");
        System.out.println();

        organizer.deleteContact("9123456789");
        organizer.searchContact("Riya");
    }
}
