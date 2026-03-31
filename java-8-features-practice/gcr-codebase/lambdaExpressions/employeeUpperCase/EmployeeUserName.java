package employeeUpperCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeUserName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Saket", "Abhishek", "Piyush", "Siddhant");

        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("UpperCase Names: ");

        upperNames.forEach(System.out::println);
    }
}

