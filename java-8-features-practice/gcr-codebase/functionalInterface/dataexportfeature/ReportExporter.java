package functionalInterface.dataexportfeature;

// Interface for exporting reports
interface ReportExporter {

    void exportToCSV();

    void exportToPDF();

    // New default method added later
    default void exportToJSON() {

        System.out.println("Exporting report to JSON");
    }
}
