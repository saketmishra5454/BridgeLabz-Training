package streamApi.hospital_doctoravailability;

import java.util.*;
import java.util.stream.*;

public class HospitalService {

    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("Dr. Sharma", "Cardiologist",
                Arrays.asList("Monday", "Saturday")));

        doctors.add(new Doctor("Dr. Mehta", "Dermatologist",
                Arrays.asList("Sunday")));

        doctors.add(new Doctor("Dr. Rao", "Neurologist",
                Arrays.asList("Friday")));

        doctors.add(new Doctor("Dr. Singh", "Cardiologist",
                Arrays.asList("Saturday", "Sunday")));



        List<Doctor> weekEndDoctor = doctors.stream().filter(x-> x.getAvailableDays().contains("Saturday")
        || x.getAvailableDays().contains("Sunday"))

             //   .sorted((x,y)->x.getSpecialty()-y.getSpecialty())

                .sorted(Comparator.comparing(Doctor::getSpecialty))

                .collect(Collectors.toList());

        weekEndDoctor.forEach(System.out::println);

    }
}
