package functionalInterface.dataexportfeature;

public class ExportDemo {

    public static void main(String[] args) {

        SalesReport report = new SalesReport();

        report.exportToCSV();
        report.exportToPDF();

        // Calling default method
        report.exportToJSON();
    }
}
