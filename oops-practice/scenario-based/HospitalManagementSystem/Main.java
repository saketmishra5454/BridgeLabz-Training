//package HospitalManagementSystem;
//
//public class Main {
//	public static void main(String[] args) {
//		Patient p1 = new Patient("Virat Kohli", "123456789");
//		Doctor d1 = new Doctor("Saket Mishra","6397831045","Neurologist",500);
//		Appointment a1 = new Appointment(p1,d1,"16-01-2026");
//		a1.showAppointmentDetails();
//		p1.addRecord("Virat");
//		System.out.println(p1.getMedicalHistory());
//		
//	}
//
//}

package HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize our "Database" of Doctors
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Dr. Smith", "12345", "Cardiology", 500));
        doctors.add(new Doctor("Dr. Sharma", "67890", "Dermatology", 400));
        doctors.add(new Doctor("Dr. Patel", "11223", "Pediatrics", 300));
        doctors.add(new Doctor("Dr. Gupta", "44556", "Neurology", 700));
        doctors.add(new Doctor("Dr. Watson", "77889", "General Medicine", 200));

        // 2. Create a Patient
        Patient p1 = new Patient("Saket", "99999");

        // 3. Selection UI (Thinking like a Developer)
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to the Hospital System ---");
        System.out.println("Select a doctor by entering their number:");

        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i).getName() + " (" + doctors.get(i).getSpecialization() + ")");
        }

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        // 4. Validation (Safety Check)
        if (choice > 0 && choice <= doctors.size()) {
            Doctor selectedDoctor = doctors.get(choice - 1);
            
            // 5. Book Appointment
            Appointment appt = new Appointment(p1, selectedDoctor, "2026-01-20");
            System.out.println("\n--- Appointment Confirmed! ---");
            appt.showAppointmentDetails();
        } else {
            System.out.println("Invalid selection. Please restart.");
        }
        
        sc.close();
    }
}
