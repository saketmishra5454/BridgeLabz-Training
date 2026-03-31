package collectors.order_revenue_summary;

import java.io.DataOutput;
import java.util.*;
import java.util.stream.*;

public class OrderService {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("O101", "Saket", 2500.50),
                new Order("O102", "Sneha", 1800.00),
                new Order("O103", "Saket", 3200.75),
                new Order("O104", "Piyush", 1500.00),
                new Order("O105", "Sneha", 2200.25)
        );


        Map<String, Double> result = orders.stream().collect(Collectors.groupingBy(Order::getCustomerName
                , Collectors.summingDouble(Order::getTotalAmount)));

        result.forEach((name,total)-> System.out.println(name+" -> "+ total ));

    }
}
