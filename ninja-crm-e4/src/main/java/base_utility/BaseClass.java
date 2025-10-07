package base_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import object_repository.LoginPage;

public class BaseClass {
	public WebDriver driver;
 
	@BeforeClass
	public void openBro() {
//		Open the Browser		
		String BROWSER = "edge";

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() {
//		login
		driver.get("http://49.249.28.218:8098/");
		
		LoginPage lp = new LoginPage(driver);
		lp.getUn().sendKeys("Rmgyantra");
		lp.getPwd().sendKeys("rmgy@9999");
		lp.getLoginBtn().click();
	} 

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void closeBro() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
