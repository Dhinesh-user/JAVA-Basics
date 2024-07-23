package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TeesPage extends Base{
	static WebDriver driver;
	public TeesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Pattern']")
	WebElement pattern;
	
	@FindBy(xpath="//*[text()='Pattern']//parent::div/div[2]/ol/li/a")
	WebElement patternSolid;
	
	@FindBy(xpath="//*[text()='Material']")
	WebElement material;
	
	@FindBy(xpath="//*[text()='Material']//parent::div/div[2]/ol/li[2]/a")
	WebElement materialCotton;
	
	@FindBy(xpath="//*[text()='Climate']")
	WebElement climate;
	
	@FindBy(xpath="//*[text()='Climate']//parent::div/div[2]/ol/li[2]/a")
	WebElement climateWarm;
	
	@FindBy(xpath="(//*[@class='swatch-option text'])[2]")
	WebElement size;
	
	@FindBy(xpath="(//*[@class='swatch-option color'])[3]")
	WebElement color;
	
	@FindBy(xpath="//*[@id='product-addtocart-button']")
	WebElement addToCart;
	
	public void clickPattern() {
		pattern.click();
		patternSolid.click();
	}
	
	public void clickMaterial() {
		material.click();
		materialCotton.click();
	}
	
	public void clickClimate() {
		climate.click();
		climateWarm.click();
	}
	
	public void chooseCommoditiesAndAddToCart() {
		size.click();
		color.click();
		explicitWaitUntilClickable(driver, addToCart);
		addToCart.click();
	}
}
