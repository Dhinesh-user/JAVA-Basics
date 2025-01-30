package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageHRM {

WebDriver driver;
public LogoutPageHRM(WebDriver driver){
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
WebElement Dropdown;	
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
WebElement logout;	


public void Logout() {
	Dropdown.click();
	logout.click();
}

}
