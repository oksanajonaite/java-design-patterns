package proxy_reporting;

//THIS IS OUR PROXY
public class RestrictedReport implements Report{

    private MainReport mainReport;
    private String reportName;
    private UserRole userRole;

    public RestrictedReport(String reportName, UserRole userRole) {
        this.reportName = reportName;
        this.userRole = userRole;
    }

    @Override
    public void displayReport() {
        //Rodysiu tik administratoriui
        if (UserRole.ADMIN.equals(userRole)) {
            mainReport = new MainReport(reportName);
            mainReport.displayReport();
            return;
        }
        System.out.println("Access Denied! Only ADMIN can see report!");

    }
}
