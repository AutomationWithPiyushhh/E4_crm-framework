package opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_utility.BaseClass;

public class CreateOpportunityTest extends BaseClass {

	@Test
	public void createOppTest() {
		driver.findElement(By.linkText("Opportunities")).click();

		driver.findElement(By.xpath("//span[text()='Create Opportunity']")).click();

		driver.findElement(By.name("nextStep"));
		driver.findElement(By.name("opportunityName"));
		driver.findElement(By.name("salesStage"));
		driver.findElement(By.name("amount"));
		driver.findElement(By.name("probability"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));

	}
}
