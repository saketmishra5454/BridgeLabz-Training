package addressbookSystem.service;

import addressbookSystem.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBookService {
    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contactList;
    }
}
