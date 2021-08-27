package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	public static ExtentReports extent;
	public static ExtentReports getReportObject() 
	{
		
		// we need to provide the path to store the report 
				String path= System.getProperty("user.dir")+"\\reports\\index.html";
				
				ExtentSparkReporter reporter= new ExtentSparkReporter(path);
				reporter.config().setReportName("Automation Report");
				reporter.config().setDocumentTitle("Test Report");
				
				extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("TesterName", "Vijay Gandhare");
				return extent;
	}

}
