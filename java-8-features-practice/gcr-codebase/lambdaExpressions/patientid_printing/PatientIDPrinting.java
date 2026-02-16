package patientid_printing;

import java.util.*;

public class PatientIDPrinting {

    public static void main(String[] args) {

        // Creating list of patient IDs
        List<Integer> patientIDs = new ArrayList<>();

        patientIDs.add(101);
        patientIDs.add(102);
        patientIDs.add(103);
        patientIDs.add(104);

        System.out.println("Patient IDs:");
    // Using Method Reference
        patientIDs.forEach(System.out::println);
    }
}
