package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;	
	
	public void EnterUsername(String username) {
		user.sendKeys(username);
	}
	
	public void EnterPassword(String password) {
		pwd.sendKeys(password);
	}
	
	
	public void LoginButton() {
		login.click();
	}

}
