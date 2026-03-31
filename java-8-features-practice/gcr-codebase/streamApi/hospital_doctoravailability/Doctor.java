package streamApi.hospital_doctoravailability;

import java.util.*;

public class Doctor {

    private String name;
    private String specialty;
    private List<String> availableDays;

    // Constructor
    public Doctor(String name, String specialty, List<String> availableDays) {
        this.name = name;
        this.specialty = specialty;
        this.availableDays = availableDays;
    }

    // Getters (Important for Streams)
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<String> getAvailableDays() {
        return availableDays;
    }

    @Override
    public String toString() {
        return name + " - " + specialty + " - " + availableDays;
    }
}