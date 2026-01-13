
 package EcommerceManagementSystem;

public class Customer {             // customer class
    private int id;
    private String name;
    private int phoneNo;
    private String address;

    public Customer(int id, String name, int phoneNo, String address){      //taking values to initialize the variables 
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public int getId() { return id; }           //method to get the id
    public String getName() { return name; }           //method to get the name
    public int getPhoneNo() { return phoneNo; }     //method to get the phoneNo
    public String getAddress() { return address; }         //method to get the address

    @Override
    public String toString(){               //Convert the object in the String
        return "Customer[ID=" + id + ", Name=" + name + ", Phone=" + phoneNo + "]";
    }
}


