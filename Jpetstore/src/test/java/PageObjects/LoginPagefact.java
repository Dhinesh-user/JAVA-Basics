package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefact {
 
	WebDriver dr;
	
//	@FindBy(name="username")
//	WebElement user;
	@FindBy(how=How.NAME,using="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(linkText="Enter the Store")
	WebElement enterstore;
	
	@FindBy(linkText="Sign In")
	WebElement signin;
	
	public LoginPagefact(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	public void usernam(String un) {
		user.sendKeys(un);
	}
	public void passwd(String pwd) {
		pass.sendKeys(pwd);
	}
	public void enterstore(String entrstr) {
		enterstore.click();
	}
	public void signinOption(String signinbtn) {
		signin.click();
	}
}
