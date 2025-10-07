package pomExtra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {

	public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement un;

	public WebElement getUn() {
		return un;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.facebook.com/");
//			WebElement un = driver.findElement(By.id("email"));

			FaceBook fb = new FaceBook(driver);
			WebElement un = fb.getUn();
//			getUn()
			Thread.sleep(2000);
			driver.navigate().refresh();
//			un = driver.findElement(By.id("email"));
			un.sendKeys("admin");

		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
