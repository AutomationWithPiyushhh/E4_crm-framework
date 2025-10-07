package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement un;
	
//	Auto Healing
//	@FindAll({
//				@FindBy(id = "abc")	,
//				@FindBy(name = "xyz") ,
//				@FindBy(css = "//input[type='text']")
//					})
//	private WebElement we;
	
	@FindBy(id = "inputPassword")
	private WebElement pwd;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement loginBtn;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
