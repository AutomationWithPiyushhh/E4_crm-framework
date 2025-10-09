package advance_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SauceDemo {
	@Test
	public void getReport() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

//		report configuration
		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/rep1.html");
		spark.config().setDocumentTitle("Sauce demo report");
		spark.config().setReportName("First Report");
		spark.config().setTheme(Theme.STANDARD);

		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("username", "Vikas@123");
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("window", "11");

		ExtentTest test = report.createTest("getReport");
		test.log(Status.INFO, "Information");
		test.log(Status.PASS, "Passed");
		test.log(Status.WARNING, "warning");
		test.log(Status.SKIP, "skipped");
		test.log(Status.FAIL, "failed");

		report.flush();

		driver.quit();
	}
}
