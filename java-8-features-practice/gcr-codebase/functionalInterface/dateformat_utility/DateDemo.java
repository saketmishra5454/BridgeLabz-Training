package functionalInterface.dateformat_utility;

public class DateDemo {

    public static void main(String[] args) {

        String inputDate = "2026-02-13";

        String formatted =
                DateUtils.formatDate(inputDate);

        System.out.println("Formatted Date: " +
                formatted);
    }
}
