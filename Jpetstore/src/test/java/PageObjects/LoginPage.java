package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver dr;
	By username = By.name("username");
	By password = By.name("password");
	By enterlnk = By.linkText("Enter the Store");
	By signlnk = By.linkText("Sign In");
	By login = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver dr) {
		this.dr = dr;
	}

	public void usernam(String UN) {
		dr.findElement(username).clear();
		dr.findElement(username).sendKeys(UN);
	}

	public void passwrd(String pwd) {
		dr.findElement(password).sendKeys(pwd);
	}
	public void enterlink() {
		dr.findElement(enterlnk).click();
	}
	public void singinbtn() {
		dr.findElement(signlnk).click();
	}

	public void loginbtn() {
		dr.findElement(login).click();
	}

}
