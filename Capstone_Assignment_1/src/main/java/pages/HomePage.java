package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base {

	static WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Create an Account']")
	WebElement createAccount; 
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement signIn;
	
	@FindBy(xpath="//span[normalize-space()='Sale']")
	WebElement sale;
	
	@FindBy(xpath="(//ul[@class='items']//*[text()='Tees'])[2]")
	WebElement tees;
	
	@FindBy(xpath="//*[@class='product-item-link']")
	List<WebElement> teesItems;
	
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement showcart;
	
	@FindBy(xpath="//*[text()='View and Edit Cart']")
	WebElement viewAndEdit;
	
	@FindBy(xpath="(//*[@class='action switch'])[1]")
	WebElement downButton;
	
	@FindBy(xpath="(//*[@class='header links'])[2]/li")
	WebElement myAccount;
	
	@FindBy(xpath="(//*[@class='header links'])[2]/li[3]")
	WebElement signOut;
	
	@FindBy(xpath="//*[@data-ui-id='page-title-wrapper']")
	WebElement signOutMessage;
	
	public void clickOnCreateAccount() {
		createAccount.click();
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void clickSale() {
		sale.click();
	}
	
	public void clickOnTees() {
		tees.click();
	}
	
	public void clickOnFirstProduct() {
		teesItems.get(0).click();
	}
	
	public void showCart() {
		explicitWaitUntilClickable(driver,showcart);
		showcart.click();
		explicitWaitUntilClickable(driver,viewAndEdit);
		viewAndEdit.click();
	}
	
	public void clickOnMyAccount() {
		downButton.click();
		explicitWait(driver, myAccount);
		myAccount.click();
	}
	
	public String clickOnSignOut() {
		explicitWait(driver, downButton);
		downButton.click();
		explicitWait(driver, signOut);
		signOut.click();
		explicitWait(driver, signOutMessage);
		return signOutMessage.getText();
	}
}
