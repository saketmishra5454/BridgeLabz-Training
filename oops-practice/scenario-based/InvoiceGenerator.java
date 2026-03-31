public class InvoiceGenerator {

    // method to split invoice string into tasks
    static String[] parseInvoice(String input) {

        // splitting using comma
        String[] tasks = input.split(",");

        return tasks;
    }

    // method to calculate total amount
    static int getTotalAmount(String[] tasks) {

        int total = 0;

        for (int i = 0; i < tasks.length; i++) {

            // each task like "Logo Design - 3000 INR"
            String task = tasks[i].trim();

            // split using dash
            String[] parts = task.split("-");

            if (parts.length == 2) {

                // extracting amount part
                String amountPart = parts[1].trim();

                // removing INR text
                amountPart = amountPart.replace("INR", "").trim();

                int amount = Integer.parseInt(amountPart);
                total = total + amount;
            }
        }

        return total;
    }

    // method to display invoice details
    static void showInvoice(String[] tasks) {

        System.out.println("Invoice Details:");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println((i + 1) + ". " + tasks[i].trim());
        }
    }

    public static void main(String[] args) {

        // input invoice string
        System.out.println("------Generating Invoice...-------");
        String invoiceInput = "Logo Design - 3000 INR, Web Page - 4500 INR";

        // parsing invoice
        String[] tasks = parseInvoice(invoiceInput);

        // showing invoice items
        showInvoice(tasks);
        System.out.println("-------------------------------");
        // calculating total amount
        int totalAmount = getTotalAmount(tasks);

        System.out.println("Total Invoice Amount: " + totalAmount + " INR");
    }
}

