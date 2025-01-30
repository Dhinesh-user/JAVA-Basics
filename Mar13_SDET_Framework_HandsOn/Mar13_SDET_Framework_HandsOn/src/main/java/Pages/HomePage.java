 package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	 WebElement LoggedInUserDropdown;
	
	@FindBy(xpath="//*[text()='Logout']")
	 WebElement Logout;
	
	@FindBy(tagName="a")
	List<WebElement> linkTag;
	
	public  String getLoggedInUser() {
		return LoggedInUserDropdown.getText();
	}
	
	public void logoutUser() {
		LoggedInUserDropdown.click();
		Logout.click();
	}
	
	public int NoOfLinksPresent() {
		return linkTag.size();
	}
	
}
