package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class CheckoutPage extends Base {
	static WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='field _required'])[3]/div/input")
	WebElement address;

	@FindBy(xpath = "(//*[@class='field _required'])[4]/div/input")
	WebElement cityfield;

	@FindBy(xpath = "(//*[@class='field _required'])[5]/div/select")
	WebElement statefield;

	@FindBy(xpath = "(//*[@class='field _required'])[7]/div/input")
	WebElement zipcode;

	@FindBy(xpath = "(//*[@class='field _required'])[8]/div/select")
	WebElement countryfield;

	@FindBy(xpath = "(//*[@class='field _required'])[9]/div/input")
	WebElement phfield;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement shippingMethod;

	@FindBy(xpath = "//*[@class='button action continue primary']")
	WebElement next;

	@FindBy(xpath = "//*[@id='block-discount-heading']/span")
	WebElement toggleDiscount;

	@FindBy(xpath = "//*[@id='discount-code']")
	WebElement discountCode;

	@FindBy(xpath = "//*[@class='action action-apply']")
	WebElement discountSubmit;

	@FindBy(xpath = "//*[@data-ui-id='checkout-cart-validationmessages-message-error']")
	WebElement discountError;

	@FindBy(xpath = "//*[@class='action primary checkout']")
	WebElement placeOrder;

	@FindBy(xpath = "//*[@class='order-number']/strong")
	WebElement orderId;

	public String enterMandatoryFields(String add, String city, String state, String pin, String country, String ph) throws InterruptedException{
		try {
            
			explicitWaitUntilTitle(driver, "Checkout", address);
			
			address.sendKeys(add);
			cityfield.sendKeys(city);
			
			Select selState = new Select(statefield);
			selState.selectByVisibleText(state);
			
			zipcode.sendKeys(pin);
			
			Select selCountry = new Select(countryfield);
			selCountry.selectByVisibleText(country);
			
			phfield.sendKeys(ph);
			shippingMethod.click();
			next.click();
			
			explicitWaitUntilClickable(driver, toggleDiscount);
			scrollToElement(driver, toggleDiscount);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", toggleDiscount);
			discountCode.sendKeys("TEES20");
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", discountSubmit);
			
			return discountError.getText();
		}
		catch(Exception e) {
			shippingMethod.click();
			next.click();
			
			explicitWaitUntilTitle(driver, "Checkout", toggleDiscount);
			explicitWaitUntilClickable(driver, toggleDiscount);
			scrollToElement(driver, toggleDiscount);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", toggleDiscount);
			discountCode.sendKeys("TEES20");
			Thread.sleep(6000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", discountSubmit);
			
			return discountError.getText();
		}
	       }

	public void orderPlacement() {
		placeOrder.click();
	}

	public String returnOrderId() {
		return orderId.getText();
	}
}
