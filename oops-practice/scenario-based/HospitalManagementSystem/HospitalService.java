package HospitalManagementSystem;

public interface HospitalService {
	void bookAppointment(Patient P, Doctor d, String date) throws AppointmentNotAvailableException;
	void cancelAppointment(Appointment a) ;
	}

