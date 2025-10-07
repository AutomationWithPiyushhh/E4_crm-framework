package pomEx2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {

//	Declaration
	@FindBy(id = "email")
	private WebElement un;
	
//	getter
	public WebElement getUn() {
		return un;
	}

//	initialize
	public Instagram(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

//		declaration
//		WebElement un ;

//		initialization
//		un = driver.findElement(By.id("email"));

		driver.navigate().refresh();

//		re-initialize
//		un = driver.findElement(By.id("email"));

		Instagram ig = new Instagram(driver);
		ig.getUn().sendKeys("admin@123");

		Thread.sleep(3000);
		driver.quit();
	}
}
