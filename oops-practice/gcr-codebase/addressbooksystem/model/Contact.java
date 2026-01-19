package addressbooksystem.model;

public class Contact {
    private String firstName, lastName, address, city, state, zip, phoneNumber, email;

    public Contact(String firstName, String lastName, String address, String city, 
                   String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Standard Getters/Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @Override
    public String toString() {
        return "Contact [Name=" + firstName + " " + lastName + ", Address=" + address + 
               ", City=" + city + ", State=" + state + ", Zip=" + zip + 
               ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}
