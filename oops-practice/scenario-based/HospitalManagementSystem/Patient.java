package HospitalManagementSystem;

import java.util.List;
import java.util.ArrayList;
public class Patient extends Person{     //this class inherit the properties of person class
	private List<String> medicalHistory;
	
	public Patient(String name,String phone) {        // initialization of variables
		super(name,phone);
		this.medicalHistory = new ArrayList<>();
	}
	
	public void addRecord(String record) {     // method to add Record
		this.medicalHistory.add(record);
	}
	
	public List<String> getMedicalHistory()    //method to get List of medicalHistory
	{
		return medicalHistory;
	}
	

}
