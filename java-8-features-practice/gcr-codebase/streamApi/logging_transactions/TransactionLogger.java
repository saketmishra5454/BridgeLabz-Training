package streamApi.logging_transactions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TransactionLogger {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "TXN1001",
                "TXN1002",
                "TXN1003",
                "TXN1004"
        );

//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        transactionIds.forEach(txn -> {
           // String timestamp = LocalDateTime.now().format(formatter);
            System.out.println(LocalDateTime.now() + " - Transaction ID: " + txn + " processed.");
        });
    }
}
