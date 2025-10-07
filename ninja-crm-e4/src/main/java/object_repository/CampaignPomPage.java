package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPomPage {

	public CampaignPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampIcon;

	@FindBy(name = "campaignName")
	private WebElement campNameField;

	@FindBy(name = "targetSize")
	private WebElement targetSizeField;

	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement createCampButton;

	
	
	public WebElement getCampNameField() {
		return campNameField;
	}

	public WebElement getTargetSizeField() {
		return targetSizeField;
	}

	public WebElement getCreateCampButton() {
		return createCampButton;
	}

	public WebElement getCreateCampIcon() {
		return createCampIcon;
	}

}
