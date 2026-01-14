package HospitalManagementSystem;

public class AppointmentNotAvailableException extends Exception{       //inherit the Exception class properties
	public AppointmentNotAvailableException(String msg) {
		super(msg);
	}
}
