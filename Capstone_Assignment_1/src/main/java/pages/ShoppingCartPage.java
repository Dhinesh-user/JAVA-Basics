package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ShoppingCartPage extends Base {
	static WebDriver driver;
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Reviews']")
	WebElement review; 
	
	@FindBy(xpath="(//*[@class='review-content'])[1]")
	WebElement reviewContent;
	
	@FindBy(xpath="//*[@title='Add to Cart']")
	WebElement addtocart;		
	
	@FindBy(xpath="(//*[@title='Proceed to Checkout'])[2]")
	WebElement proceedtocheckout;
			
	public String reviewCheck() {
		review.click();
		return reviewContent.getText();
	}
	
	public void addToCart() {
		explicitWaitUntilClickable(driver, addtocart);
		scrollToElement(driver, addtocart);
		addtocart.click();
	}
	
	public void proceedToCheckout() {
		explicitWaitUntilTitle(driver,"Shopping Cart", proceedtocheckout);
		scrollToElement(driver, proceedtocheckout);
		proceedtocheckout.click();
	}
}
