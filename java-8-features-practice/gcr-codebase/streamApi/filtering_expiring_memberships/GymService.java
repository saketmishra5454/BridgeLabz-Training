package streamApi.filtering_expiring_memberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class GymService {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Riya", LocalDate.now().plusDays(40)),
                new Member("Sohan", LocalDate.now().plusDays(25)),
                new Member("Neha", LocalDate.now().plusDays(5)),
                new Member("Vikram", LocalDate.now().plusDays(60))
        );


        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expireSoon = members.stream()
                .filter(member -> !member.getExpiryDate().isBefore(today)
                &&
                        !member.getExpiryDate().isAfter(next30Days))
                .collect(Collectors.toList());

        expireSoon.forEach(System.out::println);

    }
}
