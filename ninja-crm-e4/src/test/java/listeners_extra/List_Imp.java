package listeners_extra;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class List_Imp implements ISuiteListener, ITestListener {

	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/rep4.html");
		spark.config().setDocumentTitle("Sauce demo report");
		spark.config().setReportName("First Report");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("username", "Vikas@123");
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("window", "11");
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		System.out.println("Method started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Passed");
		System.out.println("Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Failed");
		System.out.println("Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "SKipped");
		System.out.println("Skipped");
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
	}

}

@Listeners(listeners_extra.List_Imp.class)
class JustToProve {
	@Test
	public void case1() {
//		ExtentTest test = report.createTest("getReport");

		System.out.println("method executing");

		Assert.assertFalse(false);
	}
}