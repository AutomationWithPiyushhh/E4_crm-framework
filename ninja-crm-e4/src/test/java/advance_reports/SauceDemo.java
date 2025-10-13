package advance_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


@Listeners(listeners_extra.List_Imp.class)
public class SauceDemo {
//	ExtentReports report;
	WebDriver driver;

//	@BeforeSuite
//	public void repConfig() {
//		System.out.println("DB connectivity + Report configuration");
////		report configuration
//		ExtentSparkReporter spark = new ExtentSparkReporter("./advance_reports/rep2.html");
//		spark.config().setDocumentTitle("Sauce demo report");
//		spark.config().setReportName("First Report");
//		spark.config().setTheme(Theme.STANDARD);
//
//		report = new ExtentReports();
//		report.attachReporter(spark);
//		report.setSystemInfo("username", "Vikas@123");
//		report.setSystemInfo("browser", "chrome");
//		report.setSystemInfo("window", "11");
//	}

	@BeforeClass
	public void openBro() {
		driver = new ChromeDriver();
	}

	@Test
	public void passing() {
//		ExtentTest test = report.createTest("getReport");
		driver.get("https://www.saucedemo.com/v1/");
//		test.log(Status.PASS, "Passed");
	}

	@Test
	public void failing() {
//		ExtentTest test = report.createTest("getReport");
		driver.get("https://www.saucedemo.com/v1/");
//		test.log(Status.FAIL, "Failed");
		Assert.assertFalse(true);
		System.out.println("hey");
	}

	@Test(dependsOnMethods = "failing")
	public void skipping() {
//		ExtentTest test = report.createTest("getReport");
		driver.get("https://www.saucedemo.com/v1/");
//		test.log(Status.SKIP, "SKipped");
	}

	@AfterClass
	public void closeBro() {
		driver.quit();
	}

//	@AfterSuite
//	public void repBackup() {
//		System.out.println("DB connectivity close + Report Backup");
////		Report backup
//		report.flush();
//	}
}
