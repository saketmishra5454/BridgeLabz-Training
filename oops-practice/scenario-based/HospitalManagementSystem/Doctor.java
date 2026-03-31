package HospitalManagementSystem;

public class Doctor extends Person{     //Doctor class Extends person class
	private String specialization;
	private double baseFee;
	
	public Doctor(String name, String phone, String s,double bf) {     // constructors
		super(name,phone);
		this.specialization = s;
		this.baseFee = bf;
		
	}
	public double calculateConsultationFee() {   // method to get the consultancy fees
		return baseFee;
	}
	public String getSpecialization() {    //Mehtod to get the Doctor's Specializations
		return specialization;
	}
}
