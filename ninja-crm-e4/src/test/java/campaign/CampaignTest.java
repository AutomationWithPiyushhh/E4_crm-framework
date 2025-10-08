package campaign;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import object_repository.CampaignPomPage;
import object_repository.HomePage;

public class CampaignTest extends BaseClass {

	@Test
	public void createCampTest() throws InterruptedException {
//		Create campaign
		HomePage hp = new HomePage(driver);
		hp.getCampLink().click();

		CampaignPomPage cpp = new CampaignPomPage(driver);
		cpp.getCreateCampIcon().click();

//		driver.findElement(By.name("expectedCloseDate")).sendKeys("2025-08-15");

		String cName = "abc";
		cpp.getCampNameField().sendKeys(cName);
		cpp.getTargetSizeField().sendKeys("15");
		cpp.getCreateCampButton().click();

//		Verification
		String actcName = driver.findElement(By.xpath("//td[text()='" + cName + "']")).getText();
		
		Assert.assertEquals(actcName, cName);
		
//		if (actcName.equals(cName)) {
//			System.out.println("Campaign Created Successfully!!!");
//		}else {
//			System.out.println("Campaign could not be Created Successfully!!!");			
//		}

		Thread.sleep(5000);
	}
}
