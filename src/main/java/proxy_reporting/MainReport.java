package proxy_reporting;

//REAL.MAIN object
public class MainReport implements Report {

    private String reportName;

    public MainReport(String reportName) {
        this.reportName = reportName;
        loadreportFromDatabase();
    }

    private void loadreportFromDatabase () {
        System.out.println("Loading report from DB. Report: " + reportName);
    }

    @Override
    public void displayReport() {
        System.out.println("Display report in the screen. Report: " + reportName);

    }
}
