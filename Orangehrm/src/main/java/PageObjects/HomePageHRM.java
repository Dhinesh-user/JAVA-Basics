package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageHRM {

WebDriver driver;
public HomePageHRM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
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

