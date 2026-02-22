package streamApi.Insurance_claimavailability;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceService {

    public static void main(String[] args) {

        List<Claim> claimList = Arrays.asList(
                new Claim("C101", "Health", 5000),
                new Claim("C102", "Vehicle", 8000),
                new Claim("C103", "Health", 7000),
                new Claim("C104", "Vehicle", 6000),
                new Claim("C105", "Home", 10000)
        );


        Map<String, Double> result = claimList.stream().collect(
                Collectors.groupingBy(Claim::getClaimType, Collectors
                        .averagingDouble(Claim::getAmount)));

        result.forEach((type, avg) -> System.out.println(type+ " "+ avg));

    }
}
