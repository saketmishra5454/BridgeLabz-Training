package functionalInterface.dataexportfeature;

class SalesReport implements ReportExporter {

    public void exportToCSV() {

        System.out.println("Exported to CSV");
    }

    public void exportToPDF() {

        System.out.println("Exported to PDF");
    }
}
