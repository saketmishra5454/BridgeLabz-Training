package HospitalManagementSystem;

public class Person {             // this is the person class 
	private String name;           // name of the person
	private String phone;        // Phone no. of the person
	 
	public Person(String n,String p) {           // values given to the variables
		this.name = n;
		this.phone = p;
	}
	public String getName() {           // method tp get the Name
		return name;
	}
	public String getPhone() {          // Method to get the Phone no.
		return phone;
	}

}
