package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Pages.FindBy;
//import Pages.WebElement;

public class LoginPageHRM {
//	WebDriver dr;
//	By username = By.name("username");
//	By password = By.name("password");
//	By login = By.xpath("//button[@type='submit']");
//	
//
//	public LoginPageHRM(WebDriver dr) {
//		this.dr = dr;
//	}
//
//	public void usernam(String UN) {
//		dr.findElement(username).click();
//		dr.findElement(username).sendKeys(UN);
//	}
//
//	public void passwrd(String pwd) {
//		dr.findElement(password).sendKeys(pwd);
//	}
//
//	public void loginbtn() {
//		dr.findElement(login).click();
//	}
// 
//}

	WebDriver driver;
	public LoginPageHRM(WebDriver driver){
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

  
