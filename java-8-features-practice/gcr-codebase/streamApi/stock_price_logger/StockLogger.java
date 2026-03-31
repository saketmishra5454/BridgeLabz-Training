package streamApi.stock_price_logger;

import java.util.*;
import java.util.stream.*;

public class StockLogger {

    public static void main(String[] args) {

        List<Stock> liveFeed = Arrays.asList(
                new Stock("TCS", 3650.50),
                new Stock("Infosys", 1450.75),
                new Stock("HDFC", 1600.00),
                new Stock("Reliance", 2500.25)
        );

      //  liveFeed.stream().forEach(System.out::println);
        liveFeed.forEach(System.out::println);
    }
}