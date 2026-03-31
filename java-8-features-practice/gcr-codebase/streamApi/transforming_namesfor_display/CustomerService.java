package streamApi.transforming_namesfor_display;

import java.util.*;
import java.util.stream.*;


public class CustomerService {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "rahul",
                "Amit",
                "sneha",
                "vikram",
                "neha"
        );

        List<String> result = names.stream().map(String::toUpperCase)
                .sorted().
                 collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}