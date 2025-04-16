import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() throws IOException {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/Rest-AHİKdReport.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.loadXMLConfig(new File("extent-config.xml"));

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Enviorment","test");
            extent.setSystemInfo("QA","Afsana Yusifova");
        }
        return extent;
    }
    //public static void renameReport(String oldPath){
    //     String timeStamp = new SimpleDateFormat("YYYY-MM-DD__HH-mm-ss").format(new Date());
//
    //      String newPath = oldPath.replace("RestAssuredReport.html",
    //            "RestAssuredReport"+timeStamp+"html");
//
    //      File oldFile = new File(oldPath);
    //    File newFile = new File(newPath);

    //  if (oldFile.renameTo(newFile)){
    // System.out.println("File renamed succesfully");
    //}else {
    //  System.out.println("File timestamp error");
    //}

    //}

}