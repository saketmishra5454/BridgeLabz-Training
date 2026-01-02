//Hospital Management System - Patient Class

public class Patient {
    static String hospitalName="City Hospital";

    String name;
    int age;
    String ailment;

    final int PATIENT_ID;
    static int count;

    public Patient(String name,int age,String ailment, int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.PATIENT_ID = patientID;
        Patient.count = Patient.count + 1;
    }

    public static int getTotalPatients(){
        return count;
    }

    public void displayPatientDetails(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Patient ID: "+PATIENT_ID);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Ailment: "+ailment);
    }

    public static void main(String[] args){
        Patient p1 = new Patient("Shivam", 21, "Flu", 1001);
        Patient p2 = new Patient("Piyush", 20,"Fracture",1002);
        System.out.println("Total Patients Admitted: "+Patient.getTotalPatients());


        if(p1 instanceof Patient){

            p1.displayPatientDetails();
        }
        if(p1 instanceof Patient){
            p2.displayPatientDetails();
        }
    }
}
