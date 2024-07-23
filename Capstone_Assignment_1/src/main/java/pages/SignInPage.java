package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	static WebDriver driver;
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement emailId; 
	
	@FindBy(id="pass")
	WebElement password; 
	
	@FindBy(id="send2")
	WebElement submit;
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnSignIn() {
		submit.click();
	}
	
}
