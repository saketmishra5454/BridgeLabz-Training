package invoiceobject_creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceDemo {
    public static void main(String[] args) {

        //Transaction IDs

        List<Integer> ids = Arrays.asList(1001, 1002, 1003, 1004);

        List<Invoice> invoicesIds = ids.stream().map(Invoice::new).collect(Collectors.toList());

        System.out.println("Invoices: ");

        invoicesIds.forEach(Invoice::display);
    }
}
