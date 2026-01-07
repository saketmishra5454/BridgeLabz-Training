// Interface for medical record related work
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class Patient
abstract class Patient {

    // encapsulation: private data
    private int patientId;
    private String name;
    private int age;

    // sensitive info (medical data)
    private String diagnosis;
    private String medicalHistory;

    // constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getters only (no setters for safety)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    // concrete method
    public void getPatientDetails() {
        System.out.println("Patient Id: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // protected methods to access sensitive data
    protected void setMedicalData(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    protected void showMedicalData() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }

    // abstract method
    public abstract double calculateBill();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge + 2000; // extra service charges
    }

    @Override
    public void addRecord(String record) {
        setMedicalData("Serious Illness", record);
    }

    @Override
    public void viewRecords() {
        showMedicalData();
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        setMedicalData("Minor Issue", record);
    }

    @Override
    public void viewRecords() {
        showMedicalData();
    }
}

// Main class
public class HospitalPatientManagement {

    public static void main(String[] args) {

        // polymorphism
        Patient p1 = new InPatient(1, "Ramesh", 45, 5, 3000);
        Patient p2 = new OutPatient(2, "Sita", 30, 500);

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            System.out.println("----------------------------");
            p.getPatientDetails();

            // interface reference
            MedicalRecord m = (MedicalRecord) p;
            m.addRecord("Treatment ongoing");
            m.viewRecords();

            // dynamic method calling
            System.out.println("Total Bill: " + p.calculateBill());
        }
    }
}
