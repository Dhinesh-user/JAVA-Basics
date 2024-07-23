package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class MyOrderPage extends Base{
	
	static WebDriver driver;
	public MyOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='my-orders-table']//tbody/tr")
	List<WebElement> orderTable;
	
	@FindBy(xpath="//*[@id='my-orders-table']//tbody/tr/td[1]")
	List<WebElement> orderIDs;
	
	@FindBy(xpath="//*[@id='my-orders-table']//tbody/tr/td[6]/a[1]")
	List<WebElement> viewOrder;
	
	@FindBy(xpath="//*[@data-ui-id='page-title-wrapper']")
	WebElement orderDisplay;
	
	public String toViewOrderFromOrderTable(String orderID) {
		int index = 0;
		for(int i=0;i<orderTable.size();i++) {
			if(orderIDs.get(i).getText().equals(orderID)) index=i;
		}
		viewOrder.get(index).click();
		explicitWait(driver, orderDisplay);
		return orderDisplay.getText();
	}
}
