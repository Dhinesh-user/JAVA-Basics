package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	static WebDriver driver;
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	WebElement firstName; 
	
	@FindBy(id="lastname")
	WebElement lastName; 
	
	@FindBy(id="email_address")
	WebElement emailId; 
	
	@FindBy(id="password")
	WebElement password; 
	
	@FindBy(id="password-confirmation")
	WebElement cpassword; 
	
	@FindBy(xpath="//*[@title='Create an Account']")
	WebElement createAccountButton;
	
	public void enterFirstname(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void enterLastname(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void enterConfirmedPassword(String pwd) {
		cpassword.sendKeys(pwd);
	}
	
	public void clickCreateAccount() {
		createAccountButton.click();
	}
}
