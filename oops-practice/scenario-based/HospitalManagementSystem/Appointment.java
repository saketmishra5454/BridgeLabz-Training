package HospitalManagementSystem;

public class Appointment {      //class Appointment
	 private Patient patient;
	 private Doctor doctor;
	 private String date;
	 
	 public Appointment(Patient patient, Doctor doctor,String date) {     //initialization of variables
		 this.patient = patient;
		 this.doctor = doctor;
	     this.date = date;
	 }
	 
	 public void showAppointmentDetails() {          //Method to show the details of Appointment
		 System.out.println("Appointment for "+ patient.getName());
		 System.out.println("with " + doctor.getName()+ "(" +doctor.getSpecialization()+")");
		 System.out.println("on date: "+ date);
		 System.out.println("at the Consultation Fee of: " + doctor.calculateConsultationFee());
	 }

}
